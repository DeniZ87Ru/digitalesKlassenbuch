package com.example.demo.Service;

import com.example.demo.Model.Wochentag;
import com.example.demo.Repository.WochentagRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WochentagService implements WochentagServices {

    private WochentagRepository wochentagRepository;

    public WochentagService(WochentagRepository wochentagRepository) {
        super();
        this.wochentagRepository = wochentagRepository;
    }
    public List<Wochentag> getAllWochentage() {
        return wochentagRepository.findAll();
    }
    @Override
    public Wochentag saveWochentag(Wochentag wochentag) {
        return wochentagRepository.save(wochentag);
    }

    @Override
    public Wochentag getWochentagById(Long id) {
        return wochentagRepository.findById(id).get();
    }

    @Override
    public Wochentag updateWochentag(Wochentag wochentag) {
        return wochentagRepository.save(wochentag);
    }

    @Override
    public void deleteWochentagById(Long id) {
        wochentagRepository.deleteById(id);
    }
}
