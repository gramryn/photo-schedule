package com.woowa.photo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * RidersApiApplication 클래스
 *
 * @author 
 * @version 1.0
 * @since 2019.03.14
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.woowa.photo"})
public class RidersApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RidersApiApplication.class, args);
	}
	

}
