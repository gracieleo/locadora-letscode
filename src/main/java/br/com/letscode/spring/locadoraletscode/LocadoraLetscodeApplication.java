package br.com.letscode.spring.locadoraletscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class LocadoraLetscodeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LocadoraLetscodeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
