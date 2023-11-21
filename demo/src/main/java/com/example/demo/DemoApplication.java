package com.example.demo;

import java.net.URL;
import java.util.List;
import com.example.demo.Models.Message;
import com.example.demo.Utils.deCypher;

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
			messages.forEach((message) -> {
				if(message.house.equals("atreides")) {
					message.message = deCypher.deCypherMsg(message.message, true);
				} else {
					message.message = deCypher.deCypherMsg(message.message, false);
				}
				System.out.println(message);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
