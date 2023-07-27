package com.bidi.auth.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponseMessage {
    private String message;

    public ResponseMessage() {
    }

    public ResponseMessage(String message) {
        this.message = message;
    }
}
