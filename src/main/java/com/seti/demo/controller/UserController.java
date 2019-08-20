package com.seti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.seti.demo.entity.UserEntity;
import java.util.List;
import com.seti.demo.service.UserService;

@RestController
 @RequestMapping("/user")
 public class UserController {
     @Autowired
     UserService userService;
 
     @RequestMapping(method = RequestMethod.GET)
     public List<UserEntity> getAllUsers() {
         return userService.getAllUsers();
     }
 
     @RequestMapping(method = RequestMethod.POST,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     @ResponseBody()
     public UserEntity addNewUser(@RequestBody UserEntity user) {
         return this.userService.addUser(user);
     }
     
     //other controllers omitted for brevity
 
 }