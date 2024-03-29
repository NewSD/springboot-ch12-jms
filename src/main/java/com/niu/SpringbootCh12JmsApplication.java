package com.niu;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class SpringbootCh12JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCh12JmsApplication.class, args);
	}


	@Bean
	Queue queue(){
		return new ActiveMQQueue("amq");
	}
}
