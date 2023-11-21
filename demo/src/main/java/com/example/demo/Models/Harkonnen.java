package com.example.demo.Models;

public class Harkonnen implements House {
    public String name = "Harkonnen";
    public String decode(String msg) {
        // Harkonnen
        // Shift every character by 2 to the left
        String newMessage = "";
        String toDecode = msg;
        for(int i = 0; i < toDecode.length(); i++) {
            char c = toDecode.charAt(i);
            c -= 2;
            newMessage += c;
        }
        return newMessage;
    }
}
