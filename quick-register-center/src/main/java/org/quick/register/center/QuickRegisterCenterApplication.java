package org.quick.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuickRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickRegisterCenterApplication.class, args);
    }

}
