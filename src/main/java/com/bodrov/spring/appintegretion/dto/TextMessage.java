package com.bodrov.spring.appintegretion.dto;

public class TextMessage {

    private String message = "";

    public TextMessage(){}

    public TextMessage(String message){this.message=message;}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
