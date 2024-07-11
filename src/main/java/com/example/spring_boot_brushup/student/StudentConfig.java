package com.example.spring_boot_brushup.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kseniya = new Student(
                    "Kseniya",
                    "kseniya@gmail.com",
                    LocalDate.of(2000, Month.JUNE, 7));
            Student mickey = new Student(
                    "Mickey",
                    "mickey@gmail.com",
                    LocalDate.of(1973, Month.SEPTEMBER, 13));
            repository.saveAll(List.of(kseniya, mickey));
        };
    }
}
