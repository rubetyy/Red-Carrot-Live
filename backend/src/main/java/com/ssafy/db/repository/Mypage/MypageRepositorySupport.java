package com.ssafy.db.repository.Mypage;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.api.response.dto.Mypage.MypageChatList;
import com.ssafy.api.response.dto.Mypage.MypagePRes;
import com.ssafy.db.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * 유저 모델 관련 디비 쿼리 생성을 위한 구현 정의.
 */
@Repository
public class MypageRepositorySupport {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;
    QUser qUser = QUser.user;
    QProduct qProduct = QProduct.product;
    QChatroom qChatroom = QChatroom.chatroom;
    QWish qWish = QWish.wish;

    //하드코딩
    public Map<String,Object> mypageinfo(String userid){
        Map<String,Object> res = new HashMap<String,Object>();
        //userinfo
        User user = jpaQueryFactory.select(Projections.fields(User.class,qUser.userid,qUser.usernickname)).from(qUser)
                .where(qUser.userid.eq(userid)).fetchOne();
        res.put("userinfo",user);

        //issold
        List<MypagePRes> issold = (List<MypagePRes>)jpaQueryFactory.select(Projections.fields(MypagePRes.class,qProduct.id,qProduct.title))
                .from(qProduct).where(qProduct.isSold.eq(0),qProduct.userId.eq(userid)).fetch();
        res.put("issold",issold);

        //soldout
        List<MypagePRes> soldout =(List<MypagePRes>) jpaQueryFactory.select(Projections.fields(MypagePRes.class,qProduct.id,qProduct.title))
                .from(qProduct).where(qProduct.isSold.eq(1),qProduct.userId.eq(userid)).fetch();
        res.put("soldout",soldout);

        //orderlist
        List<Chatroom> orderlistc = (List<Chatroom>) jpaQueryFactory.select(qChatroom).from(qChatroom)
                .where(qChatroom.useridbuyer.eq(userid),qChatroom.buy.eq(1)).fetch();
        List<MypagePRes> orderlist = new ArrayList<>();
        for(Chatroom c : orderlistc){
            int pk = c.getProductpk();
            MypagePRes order = jpaQueryFactory.select(Projections.fields(MypagePRes.class,qProduct.id,qProduct.title))
                    .from(qProduct).where(qProduct.id.eq(pk)).fetchOne();
            orderlist.add(order);
        }
        res.put("orderlist",orderlist);

        //wishlist
        List<Wish> wishres = (List<Wish>) jpaQueryFactory.select(qWish).from(qWish)
                .where(qWish.useridbuyer.eq(userid)).fetch();
        List<MypagePRes> wishlist = new ArrayList<>();
        for(Wish w : wishres){
            int pk = w.getProductpk();
            MypagePRes wish = jpaQueryFactory.select(Projections.fields(MypagePRes.class,qProduct.id,qProduct.title))
                    .from(qProduct).where(qProduct.id.eq(pk)).fetchOne();
            wishlist.add(wish);
        }
        res.put("wishlist",wishlist);

        //chatlist
        List<Chatroom> chatres = (List<Chatroom>) jpaQueryFactory.select(qChatroom).from(qChatroom)
                .where(qChatroom.useridseller.eq(userid).or(qChatroom.useridbuyer.eq(userid))).fetch();
        List<MypageChatList> chatlist = new LinkedList<>();
        for(Chatroom c : chatres){
            String buyernickname = jpaQueryFactory.select(qUser.usernickname).from(qUser)
                    .where(qUser.userid.eq(c.getUseridbuyer())).fetchOne();
            String sellernickname = jpaQueryFactory.select(qUser.usernickname).from(qUser)
                    .where(qUser.userid.eq(c.getUseridseller())).fetchFirst();
            MypageChatList mypageChat = new MypageChatList(c);
            mypageChat.setBuyernickname(buyernickname);
            mypageChat.setSellernickname(sellernickname);
            chatlist.add(mypageChat);
        }
        res.put("chatlist",chatlist);
        return res;
    }
}
