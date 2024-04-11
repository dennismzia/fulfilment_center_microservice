package com.fulfill.app.processorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProcessOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProcessOrderApplication.class,args);

    }

//    @Bean
//    CommandLineRunner commandLineRunner(){
//        return args -> {
//            Person person = Person.builder()
//                    .name("John")
//                    .age(30)
//                    .email("john@example.com")
//                    .build();
//            System.out.println(person);
//            // Person(name=John, age=30, email=john@example.com)
//        };
//        };
    }

