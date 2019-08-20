package com.seti.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seti.demo.entity.UserEntity;
import java.util.List;
import com.seti.demo.dao.UserDao;

@Service
 public class UserService {
     @Autowired
     UserDao userDao;
 
     public List<UserEntity> getAllUsers() {
         return this.userDao.findAll();
     }
 
     public UserEntity addUser(UserEntity user) {
         return this.userDao.save(user);
     }
 
     //other methods omitted for brevity
 }