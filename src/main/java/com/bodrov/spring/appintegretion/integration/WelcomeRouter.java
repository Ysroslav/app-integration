package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

@MessageEndpoint
public class WelcomeRouter {

    @Router(inputChannel = "welcomeChannel")
    public String route(WelcomeMessage message){
        if(message.getName()==null || message.getName().isEmpty()) return "welcomeNullableChannel";
        return "welcomeNotNullChannel";
    }
}
