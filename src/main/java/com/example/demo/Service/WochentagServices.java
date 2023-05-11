package com.example.demo.Service;

import com.example.demo.Model.Wochentag;

import java.util.List;

public interface WochentagServices {

    List<Wochentag> getAllWochentage();

    Wochentag saveWochentag(Wochentag wochentag);

    Wochentag getWochentagById(Long id);

    Wochentag updateWochentag(Wochentag wochentag);

    void deleteWochentagById(Long id);
}