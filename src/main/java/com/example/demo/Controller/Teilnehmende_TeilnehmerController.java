package com.example.demo.Controller;

import com.example.demo.Service.TeilnehmendeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Teilnehmende_TeilnehmerController {

    private TeilnehmendeService teilnehmendeService;

    public Teilnehmende_TeilnehmerController(TeilnehmendeService teilnehmendeService) {
        super();
        this.teilnehmendeService = teilnehmendeService;
    }

    @GetMapping("/teilnehmende_teilnehmer")
    public String listTeilnehmende(Model model) {
        model.addAttribute("teilnehmende", teilnehmendeService.getAllTeilnehmende());
        return "teilnehmende_teilnehmer";
    }
}