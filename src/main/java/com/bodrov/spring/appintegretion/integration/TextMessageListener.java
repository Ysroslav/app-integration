package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.TextMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class TextMessageListener {

    private static final Logger LOGGER = Logger.getLogger(TextMessageListener.class.getSimpleName());

    @ServiceActivator(inputChannel = TextMessageGateway.CHANNEL)
    public void handler(TextMessage message){
        LOGGER.info(message.getMessage());
    }
}
