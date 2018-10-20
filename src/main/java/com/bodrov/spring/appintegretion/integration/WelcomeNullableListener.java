package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class WelcomeNullableListener {

    private static final Logger LOGGER = Logger.getLogger(WelcomeNullableListener.class.getSimpleName());

    @ServiceActivator(inputChannel = "welcomeNullableChannel")
    public void handler(WelcomeMessage message){LOGGER.info("HELLO NONE!");}
}
