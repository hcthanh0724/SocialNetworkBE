package com.example.testproject.model;

import java.awt.*;

public class ChatMessage {

    //xác định loại tin nhắn
    private MessageType type;
    private String content;
    private Account sender;

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }

    public ChatMessage(MessageType type, String content, Account sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public ChatMessage() {
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }
}
