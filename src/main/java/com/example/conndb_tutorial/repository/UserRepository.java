package com.example.conndb_tutorial.repository;

import com.example.conndb_tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
