package br.lucasdev.projetospringboot.springdatajpa;

import br.lucasdev.projetospringboot.springdatajpa.model.User;
import br.lucasdev.projetospringboot.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
//        User user = new User();
//        user.setName("Lucas");
//        user.setEmail("lucasdev@gmail.com");
//        user.setPassword("devlucas");
//
//        userRepository.save(user);

        System.out.println(userRepository.findByEmail("lucasdev@gmail.com"));
        System.out.println(userRepository.filterByName("ucas"));
    }
}
