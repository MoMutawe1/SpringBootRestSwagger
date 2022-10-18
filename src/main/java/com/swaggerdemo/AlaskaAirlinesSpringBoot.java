package com.swaggerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.swaggerdemo."})
public class AlaskaAirlinesSpringBoot {

        public static void main(String[] args) {
            SpringApplication.run(AlaskaAirlinesSpringBoot.class, args);
        }
}
