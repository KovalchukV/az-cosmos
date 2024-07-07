package org.example.azcosmos.controller;

import com.azure.core.annotation.Get;
import org.example.azcosmos.entity.User;
import org.example.azcosmos.repo.UserRepo;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> result = StreamSupport.stream(userRepo.findAll().spliterator(), false)
                .toList();
        return ResponseEntity.ok(result);
//        return ResponseEntity.ok(List.of("hello"));
    }
}
