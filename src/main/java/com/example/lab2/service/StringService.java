package com.example.lab2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class StringService {
    public String analyzeString(@PathVariable("string") String string) {
        int upperCounter = 0;
        int lowerCounter = 0;
        int digitCounter = 0;
        int specialCounter = 0;
        int ownCombinationCounter = 0;

        char letter;

        for (int i = 0; i < string.length(); ++i) {
            letter = string.charAt(i);
            if (!Character.isLowerCase(letter) && !Character.isUpperCase(letter)) ownCombinationCounter++;
            if (Character.isUpperCase(letter)) upperCounter++;
            else if (Character.isLowerCase(letter)) lowerCounter++;
            else if (Character.isDigit(letter)) digitCounter++;
            else specialCounter++;
        }
        return "UPPER: " + upperCounter + " LOWER: " + lowerCounter + " DIGIT: " + digitCounter + " SPECIAL: " + specialCounter + " OWN: " + ownCombinationCounter;
    }
}
