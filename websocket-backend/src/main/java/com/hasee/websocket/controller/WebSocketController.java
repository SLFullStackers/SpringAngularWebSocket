package com.hasee.websocket.controller;

import com.hasee.websocket.model.Passport;
import com.hasee.websocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private WebSocketService webSocketService;

    @MessageMapping("/send/message")
    public void sendMessage(String message) {
        System.out.println(message);
        webSocketService.sendMessage(message);
    }

    @MessageMapping("/send/passport")
    public void sendPassport(Passport passport) {
        System.out.println(passport);
        webSocketService.sendPassport(passport);
    }
}