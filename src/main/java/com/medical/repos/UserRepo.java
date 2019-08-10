package com.medical.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
