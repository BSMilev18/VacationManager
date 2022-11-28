package com.example.springvacmanager.service;
import com.example.springvacmanager.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
@ComponentScan("com.example.springvacmanager")
public class SpringVacmanagerApplication implements CommandLineRunner{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args){
        SpringApplication.run(SpringVacmanagerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        String sql = "SELECT * FROM users";
        List<User> userList = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(User.class));
        userList.forEach(System.out :: println);
    }
}
