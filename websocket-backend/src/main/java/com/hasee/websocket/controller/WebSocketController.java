package com.hasee.websocket.controller;

import com.hasee.websocket.model.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private final SimpMessagingTemplate template;

    @Autowired
    WebSocketController(SimpMessagingTemplate template){
        this.template = template;
    }

    @MessageMapping("/send/message")
    public void sendMessage(String message){
        System.out.println(message);
        this.template.convertAndSend("/message",  message);
    }

    @MessageMapping("/send/passport")
    public void sendPassport( Passport passport){
        System.out.println(passport);
        this.template.convertAndSend("/passport",  passport);
    }
}