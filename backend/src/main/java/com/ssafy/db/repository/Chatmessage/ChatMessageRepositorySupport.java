package com.ssafy.db.repository.Chatmessage;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.db.entity.Message;
import com.ssafy.db.entity.QMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ChatMessageRepositorySupport {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;
    QMessage qMessage = QMessage.message1;

    public List<Message> selectAllChat(int chatroompk){
        return jpaQueryFactory.select(qMessage).from(qMessage)
                .where(qMessage.roomId.eq(chatroompk)).orderBy(qMessage.now.asc()).fetch();
    }


}