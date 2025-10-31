package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    public ResponseEntity<?> test() {

        return ResponseEntity.ok().body("test");
    }
}
