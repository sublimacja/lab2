package com.example.lab2.service;

import com.example.lab2.response.StringResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StringService {
    public StringResponseDto analyzeString(@PathVariable("string") String string) {
        return null;
    }
}
