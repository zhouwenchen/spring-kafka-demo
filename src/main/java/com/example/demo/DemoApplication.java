package com.example.demo;

import com.example.demo.produce.Sender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Sender sender = context.getBean(Sender.class);
		System.out.println("开始发送=============");
		sender.send();
		System.out.println("开始结束=============");
	}
}
