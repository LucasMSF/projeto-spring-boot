package br.lucasdev.projetospringboot.propertiesvalues;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

public class PropertiesRunner implements CommandLineRunner {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("name: " + this.name + " age: " + this.age);

    }
}
