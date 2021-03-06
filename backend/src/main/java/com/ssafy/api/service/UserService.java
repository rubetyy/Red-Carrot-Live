package com.ssafy.api.service;

import com.ssafy.api.request.dto.User.UserRegisterPostReq;
import com.ssafy.db.entity.User;

/**
 *	유저 관련 비즈니스 로직 처리를 위한 서비스 인터페이스 정의.
 */
public interface UserService {
	User createUser(UserRegisterPostReq userRegisterInfo);
	User deleteUser(String userId);
	User getUserByUserId(String userId);
	long updateUser(User userUpdatePostReq,String userId);
	boolean check(String userId);
	boolean checkNickname(String userNickname);
}
