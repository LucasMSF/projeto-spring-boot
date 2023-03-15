package br.lucasdev.projetospringboot.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarRunner implements CommandLineRunner {
    @Autowired
    private Car car;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(car);
    }
}
