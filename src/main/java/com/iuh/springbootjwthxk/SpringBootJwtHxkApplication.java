package com.iuh.springbootjwthxk;

import com.iuh.springbootjwthxk.entity.User;
import com.iuh.springbootjwthxk.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication

public class SpringBootJwtHxkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJwtHxkApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService){
        return args -> {
            User user = new User(null,"khang", "1234567");
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            userService.createUser(user);
        };
    }

}
