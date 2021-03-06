package com.bodrov.spring.appintegretion.controller;

import com.bodrov.spring.appintegretion.dto.ResultDTO;
import com.bodrov.spring.appintegretion.dto.SimpleMessage;
import com.bodrov.spring.appintegretion.dto.WelcomeMessage;
import com.bodrov.spring.appintegretion.integration.SimpleMessageGateway;
import com.bodrov.spring.appintegretion.integration.WelcomeMessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private SimpleMessageGateway simpleMessageGateway;

    @Autowired
    private WelcomeMessageGateway welcomeMessageGateway;

    @RequestMapping(value = "/ping", produces = "application/json")
    public ResultDTO ping(){return new ResultDTO();}

    @RequestMapping(value = "/simple", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO send(){
        simpleMessageGateway.fire(MessageBuilder.withPayload(new SimpleMessage())
                            .setHeader("REQ_ID", UUID.randomUUID().toString())
                            .build());
        return new ResultDTO();
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO welcome(@RequestParam(name = "name") String name){
        welcomeMessageGateway.fire(MessageBuilder.withPayload(new WelcomeMessage(name)).build());
        return new ResultDTO();
    }
}
