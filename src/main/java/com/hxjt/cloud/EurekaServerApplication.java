package com.hxjt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args)
    {
		SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println("hello-world");
        System.out.println("hello sss 2");
        System.out.println("hello sss 3");
        System.out.println("hello ssss4");
	}

}
