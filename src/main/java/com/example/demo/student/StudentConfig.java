package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mirei = new Student( "Mirei",
                "myemail@gmail.com",
                LocalDate.of(2000, Month.NOVEMBER,21));
            Student alex = new Student( "Alex",
                    "alexemail@gmail.com",
                    LocalDate.of(2000, Month.NOVEMBER,24));
            repository.saveAll(
                    Stream.of(mirei,alex).collect(Collectors.toList()));


        };
    }
}
