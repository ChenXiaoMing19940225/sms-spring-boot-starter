package com.rocco.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @programe: sms-spring-boot-starter
 * @author: Rocco
 * @create: 2022-03-18
 * @description: 启动类
 **/

@SpringBootApplication
@EnableSms
public class Run implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //.......
    }
}
