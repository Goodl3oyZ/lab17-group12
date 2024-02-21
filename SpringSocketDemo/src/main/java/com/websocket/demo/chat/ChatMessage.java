package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    static private int countOnline = 0;
    private int prevOnline;

    public static void addCount(){
        countOnline += 1;
    }

    public static void cutCount(){
        countOnline -= 1;
        if(countOnline <= 0) countOnline = 0;
    }

    public static int GetCount(){
        return countOnline;
    }

    public void setCount(){
        prevOnline = countOnline;
    }
}
