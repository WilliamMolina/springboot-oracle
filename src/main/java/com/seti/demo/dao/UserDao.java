package com.seti.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.seti.demo.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {
}