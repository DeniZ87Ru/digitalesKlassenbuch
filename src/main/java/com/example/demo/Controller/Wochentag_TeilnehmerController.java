package com.example.demo.Controller;

import com.example.demo.Service.WochentagService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Wochentag_TeilnehmerController {

    private WochentagService wochentagService;

    public Wochentag_TeilnehmerController(WochentagService wochentagService) {
        super();
        this.wochentagService = wochentagService;
    }

    @GetMapping("/wochentag_teilnehmer")
    public String listWochentage(Model model) {
        model.addAttribute("wochentag", wochentagService.getAllWochentage());
        return "wochentag_teilnehmer";
    }
}
