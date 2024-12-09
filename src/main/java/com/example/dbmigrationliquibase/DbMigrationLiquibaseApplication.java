package com.example.dbmigrationliquibase;

import com.example.dbmigrationliquibase.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DbMigrationLiquibaseApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DbMigrationLiquibaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.findAll().forEach(System.out::println);
    }

}
