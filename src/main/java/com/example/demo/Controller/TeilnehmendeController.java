package com.example.demo.Controller;

import com.example.demo.Model.Teilnehmende;
import com.example.demo.Service.TeilnehmendeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class TeilnehmendeController {

    private TeilnehmendeService teilnehmendeService;

    public TeilnehmendeController(TeilnehmendeService teilnehmendeService) {
        super();
        this.teilnehmendeService = teilnehmendeService;
    }

    @GetMapping("/teilnehmende")
    public String listTeilnehmende(Model model) {
        model.addAttribute("teilnehmende", teilnehmendeService.getAllTeilnehmende());
        return "teilnehmende";
    }

    @GetMapping("/teilnehmende/neu")
    public String createTeilnehmende(Model model) {
        Teilnehmende teilnehmende = new Teilnehmende();
        model.addAttribute("teilnehmende", teilnehmende);
        return "teilnehmende_hinzufügen";
    }

    @PostMapping("/teilnehmende")
    public String speichereTeilnehmende(@ModelAttribute("teilnehmende") Teilnehmende teilnehmende) {
        teilnehmendeService.saveTeilnehmende(teilnehmende);
        return "redirect:/teilnehmende";
    }

    @GetMapping("/teilnehmende/edit/{id}")
    public String editTeilnehmende(@PathVariable Long id, Model model) {
        model.addAttribute("teilnehmende", teilnehmendeService.getTeilnehmendeById(id));
        return "teilnehmende_bearbeiten";
    }

    @PostMapping("/teilnehmende/{id}")
    public String updateTeilnehmende(@PathVariable Long id, @ModelAttribute("teilnehmende") Teilnehmende teilnehmende, Model model) {
        Teilnehmende vorhandenerTeilnehmende = teilnehmendeService.getTeilnehmendeById(id);
        vorhandenerTeilnehmende.setId(id);
        vorhandenerTeilnehmende.setVorname(teilnehmende.getVorname());
        vorhandenerTeilnehmende.setNachname(teilnehmende.getNachname());
        vorhandenerTeilnehmende.setEmail(teilnehmende.getEmail());

        teilnehmendeService.updateTeilnehmende(vorhandenerTeilnehmende);
        return "redirect:/teilnehmende";
    }

    @GetMapping("/teilnehmende/{id}")
    public String deleteTeilnehmende(@PathVariable Long id) {
        teilnehmendeService.deleteTeilnehmendeById(id);
        return "redirect:/teilnehmende";
    }
}
