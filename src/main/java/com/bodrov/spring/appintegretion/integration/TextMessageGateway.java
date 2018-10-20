package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.SimpleMessage;
import com.bodrov.spring.appintegretion.dto.TextMessage;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = TextMessageGateway.GATEWAY, defaultRequestChannel = TextMessageGateway.CHANNEL)
public interface TextMessageGateway {

    String CHANNEL = "textMessageChannel";

    String GATEWAY = "textMessageGateway";

    @Gateway
    void fire(Message<TextMessage> message);
}
