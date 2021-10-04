package com.dharn.loginservice.repository;

import com.dharn.loginservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByEmail(String email);
}
