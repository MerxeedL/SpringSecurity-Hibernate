package com.TestWebSpring.SpringDemoTest.repositories;

import com.TestWebSpring.SpringDemoTest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
