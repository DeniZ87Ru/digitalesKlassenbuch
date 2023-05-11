package com.example.demo.Controller;

import com.example.demo.Model.Wochentag;
import com.example.demo.Service.WochentagServices;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class WochentagController {

    private WochentagServices wochentagServices;

    public WochentagController(WochentagServices wochentagService) {
        super();
        this.wochentagServices = wochentagService;
    }

    @GetMapping("/wochentag")
    public String listWochentage(Model model) {
        model.addAttribute("wochentag", wochentagServices.getAllWochentage());
        return "wochentag";
    }

    @GetMapping("/wochentag/neu")
    public String createWochentag(Model model) {
        Wochentag wochentag = new Wochentag();
        model.addAttribute("wochentag", wochentag);
        return "wochentag_hinzufügen";
    }

    @PostMapping("/wochentag")
    public String speichereWochentag(@ModelAttribute("wochentag") Wochentag wochentag) {
        wochentagServices.saveWochentag(wochentag);
        return "redirect:/wochentag";
    }

    @GetMapping("/wochentag/edit/{id}")
    public String editWochentag(@PathVariable Long id, Model model) {
        model.addAttribute("wochentag", wochentagServices.getWochentagById(id));
        return "wochentag_bearbeiten";
    }

    @PostMapping("/wochentag/{id}")
    public String updateEWochentag(@PathVariable Long id, @ModelAttribute("wochentag") Wochentag wochentag, Model model) {
        Wochentag vorhandenerWochentag = wochentagServices.getWochentagById(id);
        vorhandenerWochentag.setId(id);
        vorhandenerWochentag.setVertretung(wochentag.getVertretung());
        vorhandenerWochentag.setLernthema(wochentag.getLernthema());
        vorhandenerWochentag.setAufgabe(wochentag.getAufgabe());
        vorhandenerWochentag.setVersaeumnisse(wochentag.getVersaeumnisse());
        vorhandenerWochentag.setVerspaetungen(wochentag.getVerspaetungen());
        vorhandenerWochentag.setBemerkungen(wochentag.getBemerkungen());
        vorhandenerWochentag.setDatum(wochentag.getDatum());

        wochentagServices.updateWochentag(vorhandenerWochentag);
        return "redirect:/wochentag";
    }

    @GetMapping("/wochentag/{id}")
    public String deleteWochentag (@PathVariable Long id) {
        wochentagServices.deleteWochentagById(id);
        return "redirect:/wochentag";
    }
}
