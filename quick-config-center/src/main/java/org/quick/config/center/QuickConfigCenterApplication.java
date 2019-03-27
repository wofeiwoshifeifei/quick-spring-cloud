package org.quick.config.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class QuickConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickConfigCenterApplication.class, args);
    }

}
