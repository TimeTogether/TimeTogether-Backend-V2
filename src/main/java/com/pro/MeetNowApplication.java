package com.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MeetNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetNowApplication.class, args);
	}

}
