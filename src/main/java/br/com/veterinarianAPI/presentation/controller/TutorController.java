package br.com.veterinarianAPI.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tutors")
@Controller
public class TutorController {

    @PostMapping
    public void addTutor() {

    }

}
