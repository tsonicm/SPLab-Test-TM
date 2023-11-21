package com.example.demo.Models;

public class Atreides implements House{
    public String name = "Atreides";
    public String decode(String msg) {
        // Atreides
        // Shift every character by 3 to the right
        String newMessage = "";
        String toDecode = msg;
        for(int i = 0; i < toDecode.length(); i++) {
            char c = toDecode.charAt(i);
            c += 3;
            newMessage += c;
        }
        return newMessage;
    }
}
