package com.example.MovieTime.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.MovieTime.Entity.User;


@RepositoryRestResource(path="user")
@CrossOrigin("http://localhost:4200")
public interface UserDao extends JpaRepository<User, Integer> {
    Optional<User> findByUserEmail(String userEmail);

}
