package com.example.demo.Service;

import com.example.demo.Model.Dozent;
import com.example.demo.Repository.DozentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DozentService implements DozentServices {

    private DozentRepository dozentRepository;

    public DozentService(DozentRepository dozentRepository) {
        super();
        this.dozentRepository = dozentRepository;
    }

    @Override
    public List<Dozent> getAllDozenten() {
        return dozentRepository.findAll();
    }
    @Override
    public Dozent saveDozent(Dozent dozent) {
        return dozentRepository.save(dozent);
    }

    @Override
    public Dozent getDozentById(Long id) {
        return dozentRepository.findById(id).get();
    }

    @Override
    public Dozent updateDozent(Dozent dozent) {
        return dozentRepository.save(dozent);
    }

    @Override
    public void deleteDozentById(Long id) {
        dozentRepository.deleteById(id);
    }
}
