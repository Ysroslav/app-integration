package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class WelcomeNotNullListener {

    private static final Logger LOGGER = Logger.getLogger(WelcomeNotNullListener.class.getSimpleName());

    @ServiceActivator(inputChannel = "welcomeNotNullChannel")
    public void handler(WelcomeMessage message){LOGGER.info("HELLO " + message.getName());}
}
