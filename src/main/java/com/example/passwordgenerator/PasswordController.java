package com.example.passwordgenerator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.SecureRandom;

@Controller
public class PasswordController {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?";

    private static final String PASSWORD_ALLOW = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_CHAR;
    private static final SecureRandom RANDOM = new SecureRandom();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/generate")
    public String generatePassword( int length, Model model) {
        String password = generateRandomPassword(length);
        model.addAttribute("generatedPassword", password);
        return "index";
    }

    private String generateRandomPassword(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(PASSWORD_ALLOW.length());
            sb.append(PASSWORD_ALLOW.charAt(randomIndex));
        }
        return sb.toString();
    }
}