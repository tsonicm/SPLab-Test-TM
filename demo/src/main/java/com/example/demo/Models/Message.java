package com.example.demo.Models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Message {
    @Getter @Setter
    private String message;
    @Getter @Setter
    private String house;
    @Getter @Setter
    private Date date;

    private House h;

    public Message(String message, String house, Date date) {
        this.message = message;
        this.house = house;
        this.date = date;
    }

    public String decodeMsg() {
        if (house.equals("atreides")) {
            h = new Atreides();
        } else if (house.equals("harkonnen")) {
            h = new Harkonnen();
        }
        return h.decode(message);
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
