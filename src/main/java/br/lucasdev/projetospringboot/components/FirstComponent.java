package br.lucasdev.projetospringboot.components;

import org.springframework.stereotype.Component;

//A anotação @Component diz ao framework que a classe em questão será gerenciada pelo container Spring
@Component
public class FirstComponent {
    public String Hello() {
        return "Hello!";
    }
}
