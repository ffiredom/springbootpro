package com.springboot.gradle.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wangpan
 * @date 8/7/18 9:42 AM
 */
@SpringBootApplication
@ImportResource(locations = "classpath:spring.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
