package com.example.chatconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ChatConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatConfigServerApplication.class, args);
    }

}
