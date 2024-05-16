package com.lpnu.springBackEnd.repository;

import com.lpnu.springBackEnd.model.Lecture;
import com.lpnu.springBackEnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
