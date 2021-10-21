package com.example.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ppkwu")
public class StringController {
    @GetMapping("/lab2/string/{string}")
    public String analyzeString(@PathVariable("string") String string) {
        return null;
    }
}
