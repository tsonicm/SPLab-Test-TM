package com.example.demo;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import com.example.demo.Models.Message;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ObjectMapper mapper = new ObjectMapper();
		try {
			URL url = new URL("file:src/messages.json");
			List<Message> messages = mapper.readValue(url, new TypeReference<List<Message>>(){});
			for (Message message : messages) {
				System.out.println(message);
			}

			messages.forEach(message -> {
				System.out.println(message.decodeMsg());
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
