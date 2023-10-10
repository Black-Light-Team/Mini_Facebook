package com.example.logintest;

import com.example.logintest.Dto.UserDto;
import com.example.logintest.Service.UserImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;


@SpringBootApplication
@Slf4j
public class FacebookApplication  {


    public static void main(String[] args) {
        SpringApplication.run(FacebookApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserImpl user ){
        return args ->{
//            UserDto userDto=new UserDto();
//            userDto.setNom("hero");
//            userDto.setPrenom("prince");
//            userDto.setAdresseEmail("prince@test");
//            userDto.setDateNaissance(new Date());
//            userDto.setMotDePasse("1234");
//            log.info("User : "+user.saveUser(userDto));
//            log.info("User : "+user.allUsers());
//            log.info("User : "+user.getUser("651bca217ef049489f5083d4"));


        };
    }
}