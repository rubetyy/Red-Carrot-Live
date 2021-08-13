package com.ssafy.api.controller;

import com.ssafy.api.request.dto.Chat.ChatMessage;
import com.ssafy.api.request.dto.Chat.ChatRoomReq;
import com.ssafy.api.response.dto.Chatroom.ChatroomResponseDto;
import com.ssafy.api.service.Chat.ChatServiceImpl;
import com.ssafy.db.entity.Chatroom;
import com.ssafy.db.entity.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class ChatController {
    private final SimpMessageSendingOperations messagingTemplate;
    @Autowired
    private ChatServiceImpl chatService;

    //실시간 채팅
    @MessageMapping("/livechat/message")
    public void message(ChatMessage message) {
        //방송종료 메소드 수행
        if (ChatMessage.MessageType.LEAVE.equals(message.getType()))
            message.setMessage("");//flag값 리턴?

        messagingTemplate.convertAndSend("/sub/livechat/room/" + message.getRoomId(), message);
    }

    //일대일 채팅 - DB에 저장
    @MessageMapping("/chat/message")
    public void OnetoOnemessage(ChatMessage message) {
        if (ChatMessage.MessageType.ONE.equals(message.getType())){
            //메세지 db에 저장 Service 호출
            chatService.talk(message);
        }
        messagingTemplate.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);

    }

    //채팅방 생성 채팅방 pk리턴해줌
    @PostMapping("/chatroom/start")
    public ResponseEntity createChat(@RequestBody Chatroom chatroom){
        //존재하면 해당 리턴
        ChatroomResponseDto chatr = chatService.findChat(chatroom);

        if(chatr == null){
            // 없으면 채팅방 생성 Service 호출
            chatr = chatService.createChat(chatroom);
        }

        return new ResponseEntity(chatr, HttpStatus.OK);
    }

    @PostMapping("/chatroom")
    public ResponseEntity selectAllChat(@RequestBody ChatRoomReq chatroom){
        boolean flag = chatService.check(chatroom);
        int status = 0;
        Map<String,Object> res = new HashMap<String,Object>();
        List<Message> ml = new LinkedList<>();
        if(flag) {
            status = 1;
            ml = chatService.selectAllChat(Integer.valueOf(chatroom.getChatroompk()));
            res.put("talk",ml);
        }
        res.put("userStatus",status);

        if(ml == null) return new ResponseEntity("대화내용이 없습니다.",HttpStatus.OK);
        return new ResponseEntity(res,HttpStatus.OK);
    }

}
