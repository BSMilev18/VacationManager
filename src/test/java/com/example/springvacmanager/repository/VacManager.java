package com.example.springvacmanager.repository;

import com.example.springvacmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacManager extends JpaRepository<User,Integer> {
    void saveUser(User user);
}
