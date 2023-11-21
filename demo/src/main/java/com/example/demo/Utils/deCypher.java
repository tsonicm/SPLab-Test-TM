package com.example.demo.Utils;

public class deCypher {
    public static String deCypherMsg(String message, boolean h) {
        if(h) {
            // Atreides
            // Shift every character by 3 to the right
            String newMessage = "";
            for(int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                c += 3;
                newMessage += c;
            }
            return newMessage;
        } else {
            // Harkonnen
            // Shift every character by 2 to the left
            String newMessage = "";
            for(int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                c -= 2;
                newMessage += c;
            }
            return newMessage;
        }
    }
}
