package com.example.demo.Service;

import com.example.demo.Model.Teilnehmende;
import com.example.demo.Repository.TeilnehmendeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeilnehmendeService implements TeilnehmendeServices {

    private TeilnehmendeRepository teilnehmendeRepository;

    public TeilnehmendeService(TeilnehmendeRepository teilnehmendeRepository) {
        super();
        this.teilnehmendeRepository = teilnehmendeRepository;
    }

    @Override
    public List<Teilnehmende> getAllTeilnehmende() {
        return teilnehmendeRepository.findAll();
    }
    @Override
    public Teilnehmende saveTeilnehmende(Teilnehmende teilnehmende) {
        return teilnehmendeRepository.save(teilnehmende);
    }

    @Override
    public Teilnehmende getTeilnehmendeById(Long id) {
        return teilnehmendeRepository.findById(id).get();
    }

    @Override
    public Teilnehmende updateTeilnehmende(Teilnehmende teilnehmende) {
        return teilnehmendeRepository.save(teilnehmende);
    }

    @Override
    public void deleteTeilnehmendeById(Long id) {
        teilnehmendeRepository.deleteById(id);
    }
}
