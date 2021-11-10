package com.rx.rdp.mqcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RdpMqCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RdpMqCenterApplication.class, args);
	}

}
