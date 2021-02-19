package com.accenture.ngDemo;

import com.accenture.ngDemo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends JpaRepository<User, Integer> {
}
