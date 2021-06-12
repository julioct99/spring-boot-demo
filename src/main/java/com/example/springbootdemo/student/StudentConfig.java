package com.example.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    1L, "Mariam",
                    "Mariam@gmail.com",
                    LocalDate.of(2000, AUGUST, 5));

            Student alex = new Student(
                    2L, "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2001, AUGUST, 5));

            studentRepository.saveAll(List.of(mariam, alex));

        };
    }
}
