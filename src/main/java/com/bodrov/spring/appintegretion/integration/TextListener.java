package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.SimpleMessage;
import com.bodrov.spring.appintegretion.dto.TextMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;

import java.util.logging.Logger;

@MessageEndpoint
public class TextListener {

    private static final Logger LOGGER = Logger.getLogger(TextListener.class.getSimpleName());

    @ServiceActivator(inputChannel = TextMessageGateway.CHANNEL)
    public void handler(final TextMessage message, @Header("REQ_TEXT") final String reqText){
        LOGGER.info(reqText);
        LOGGER.info("TextMessage" + message.getMessage());
    }
}
