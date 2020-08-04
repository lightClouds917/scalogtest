package com.scalog.test.scalogtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.*","com.java4all"})
@SpringBootApplication
public class ScalogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalogtestApplication.class, args);
    }



}
