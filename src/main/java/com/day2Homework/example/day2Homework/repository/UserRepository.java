package com.day2Homework.example.day2Homework.repository;

import com.day2Homework.example.day2Homework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
