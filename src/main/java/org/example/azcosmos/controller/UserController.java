package org.example.azcosmos.controller;

import com.azure.core.annotation.Get;
import org.example.azcosmos.entity.User;
import org.example.azcosmos.repo.UserRepo;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
//
//    private final UserRepo userRepo;
//
//    public UserController(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }

    @GetMapping
    public ResponseEntity<List<String>> getAll() {
//        return ResponseEntity.ok(userRepo.findAll());
        return ResponseEntity.ok(List.of("hello"));
    }
}
