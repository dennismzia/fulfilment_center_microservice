package com.fullfll.app.processorder;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProcessOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProcessOrderApplication.class,args);

    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            Person person = Person.builder()
                    .name("John")
                    .age(30)
                    .email("john@example.com")
                    .build();
            System.out.println(person);
            // Person(name=John, age=30, email=john@example.com)
        };

        };
    }

