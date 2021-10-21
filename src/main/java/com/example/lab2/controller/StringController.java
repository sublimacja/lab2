package com.example.lab2.controller;

import com.example.lab2.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ppkwu")
@RequiredArgsConstructor
public class StringController {


    private final StringService stringService;

    @GetMapping("/lab2/string/{string}")
    public String analyzeString(@PathVariable("string") String string) {
        return stringService.analyzeString(string);
    }
}
