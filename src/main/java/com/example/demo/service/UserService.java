package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.User;

@Service
public class UserService {

    public List<User> helloWorld() {
        return List.of(
                new User(1L, "Yura", "yurkelove28@gmail.com", LocalDate.of(1996, 3, 28), 30),
                new User(2L, "Nastya", "wild28@gmail.com", LocalDate.of(1993, 3, 28), 32),
                new User(3L, "David", "david28@gmail.com", LocalDate.of(2023, 3, 28), 3));
    }

}
