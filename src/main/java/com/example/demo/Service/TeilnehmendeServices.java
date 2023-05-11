package com.example.demo.Service;

import com.example.demo.Model.Teilnehmende;

import java.util.List;

public interface TeilnehmendeServices {

    List<Teilnehmende> getAllTeilnehmende();

    Teilnehmende saveTeilnehmende(Teilnehmende teilnehmende);

    Teilnehmende getTeilnehmendeById(Long id);

    Teilnehmende updateTeilnehmende(Teilnehmende teilnehmende);

    void deleteTeilnehmendeById(Long id);
}
