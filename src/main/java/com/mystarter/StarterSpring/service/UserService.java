package com.mystarter.StarterSpring.service;

import com.mystarter.StarterSpring.dao.UserDao;
import com.mystarter.StarterSpring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user) {
        return userDao.save(user);
    }
}
