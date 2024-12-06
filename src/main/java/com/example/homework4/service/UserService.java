package com.example.homework4.service;

import com.example.homework4.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> allUsers = new ArrayList<>();

    public void addUser(User user) {
        allUsers.add(user);
    }

    public List<User> getAllUsers() {
        return allUsers;
    }
}
