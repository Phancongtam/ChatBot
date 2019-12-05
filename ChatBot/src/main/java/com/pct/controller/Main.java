package com.pct.controller;

import java.io.IOException;
import java.util.List;

/**
 * Created by ThanhD
 */
public class Main {
    public static void main(String[] args) {
        try {
            String roomId = ""; // Replace your roomId
            ChatworkClient chatworkClient = new ChatworkClient();
            chatworkClient.startChatBot(roomId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
