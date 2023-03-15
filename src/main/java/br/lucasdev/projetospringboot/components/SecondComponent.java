package br.lucasdev.projetospringboot.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondComponent implements CommandLineRunner {
    @Autowired
    private FirstComponent component;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(component.Hello());
    }

}
