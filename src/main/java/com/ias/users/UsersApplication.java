package com.ias.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.Locale;

@SpringBootApplication
public class UsersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Flux<String> nombres = Flux.just("juan", "carlos", "andres").map(element -> element.concat("_transform")).map(element -> element.toUpperCase(Locale.ROOT));
        nombres.subscribe(element -> System.out.println("Elemento recibido: " + element), error -> System.out.println("algo salió mal"));
    }
}
