package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.TextMessage;
import com.bodrov.spring.appintegretion.dto.WelcomeMessage;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = WelcomeMessageGateway.GATEWAY, defaultRequestChannel = WelcomeMessageGateway.CHANNEL)
public interface WelcomeMessageGateway {

    String CHANNEL = "welcomeMessageChannel";

    String GATEWAY = "welcomeMessageGateway";

    @Gateway
    void fire(Message<WelcomeMessage> message);
}
