package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/id")
    public IdResponse generateId() {
        return new IdResponse("XYZ7");
    }
}
