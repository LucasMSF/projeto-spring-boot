package br.lucasdev.projetospringboot.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SingletonCommand implements CommandLineRunner {
    @Autowired
    private SinglePeople lucas;

    @Autowired
    private SinglePeople maria;

    @Override
    public void run(String... args) throws Exception {
        this.lucas.setName("Lucas");
        this.maria.setName("Maria");

        System.out.println(lucas);
        System.out.println(maria);
    }
}
