package br.lucasdev.projetospringboot.beans;

import br.lucasdev.projetospringboot.propertiesvalues.PropertiesRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Beans {
    // A anotação @Bean diz ao framework que a o método em questão retornará um objeto que será gerenciado pelo container Spring
    @Bean
    public Random ramdom() {
        return new Random();
    }

    @Bean
    public PropertiesRunner propertiesRunner() {
        return new PropertiesRunner();
    }
}
