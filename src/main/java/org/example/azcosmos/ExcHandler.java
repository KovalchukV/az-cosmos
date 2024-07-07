package org.example.azcosmos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcHandler {

    @ExceptionHandler
    public ResponseEntity<String> handle(Exception e) {
        return ResponseEntity.ok(e.getMessage());
    }
}
