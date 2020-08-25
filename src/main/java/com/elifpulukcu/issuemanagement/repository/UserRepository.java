package com.elifpulukcu.issuemanagement.repository;

import com.elifpulukcu.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {

        User findByUsername(String username);
}
