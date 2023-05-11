package com.example.demo.Controller;

import com.example.demo.Service.DozentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Dozent_TeilnehmerController {

    private DozentService dozentService;

    public Dozent_TeilnehmerController(DozentService dozentService) {
        super();
        this.dozentService = dozentService;
    }

    @GetMapping("/dozent_teilnehmer")
    public String listDozenten(Model model) {
        model.addAttribute("dozent", dozentService.getAllDozenten());
        return "dozent_teilnehmer";
    }
}