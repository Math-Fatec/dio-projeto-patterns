package one.digitalinnovation.gof.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Init
 * Os seguintes módulos foram selecionados:
 * Spring Web
 * Spring Data JPA
 * H2 Database
 * OpenFeign
 * 
 * @author Math-Fatec
 */

 @EnableFeignClients
 @SpringBootApplication
 public class Application {
    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }
 }
 