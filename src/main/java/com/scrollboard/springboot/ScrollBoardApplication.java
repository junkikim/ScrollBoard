package com.scrollboard.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ScrollBoardApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ScrollBoardApplication.class, args);
		new SpringApplicationBuilder(ScrollBoardApplication.class).properties("spring.config.location=" +"classpath:/db.properties").run(args);
	}

}
