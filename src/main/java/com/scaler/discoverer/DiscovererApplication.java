package com.scaler.discoverer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscovererApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscovererApplication.class, args);
    }

}
