package com.hasee.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/socket")
                .setAllowedOrigins("*")
                .withSockJS();
    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app")
                .enableSimpleBroker("/message", "/passport");
    }

    @Override
    public void configureWebSocketTransport( WebSocketTransportRegistration registration )
    {
        registration.setMessageSizeLimit( 300000 * 50 ); // default : 64 * 1024
        registration.setSendTimeLimit( 30 * 10000 ); // default : 10 * 10000
        registration.setSendBufferSizeLimit( 3 * 512 * 1024 ); // default : 512 * 1024
    }
}