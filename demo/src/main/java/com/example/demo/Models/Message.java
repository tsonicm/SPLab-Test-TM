package com.example.demo.Models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Message {
    @Getter @Setter
    public String message;
    @Getter @Setter
    public String house;
    @Getter @Setter
    public Date date;

    public Message(String message, String house, Date date) {
        this.message = message;
        this.house = house;
        this.date = date;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" + "\n\t" +
                "message='" + message + '\'' + "\n\t" +
                ", house='" + house + '\'' + "\n\t" +
                ", date=" + date + "\n" +
                '}';
    }
}
