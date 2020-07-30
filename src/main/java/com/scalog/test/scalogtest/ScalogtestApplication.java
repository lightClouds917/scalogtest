package com.scalog.test.scalogtest;

import com.java4all.scalog.properties.springcloud.EnableScalogSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan({"com.*","com.java4all"})
@SpringBootApplication
@EnableScalogSpringConfig
public class ScalogtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalogtestApplication.class, args);
    }



}
