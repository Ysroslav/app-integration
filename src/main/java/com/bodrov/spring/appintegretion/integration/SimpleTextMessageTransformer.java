package com.bodrov.spring.appintegretion.integration;

import com.bodrov.spring.appintegretion.dto.SimpleMessage;
import com.bodrov.spring.appintegretion.dto.TextMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

@MessageEndpoint
public class SimpleTextMessageTransformer {

    @Transformer(inputChannel = SimpleMessageGateway.CHANNEL, outputChannel = TextMessageGateway.CHANNEL)
    public TextMessage transform(SimpleMessage simpleMessage){
        System.out.println("SimpleTextMessageTransformer");
        return new TextMessage(simpleMessage.getDate().toString());
    }
}
