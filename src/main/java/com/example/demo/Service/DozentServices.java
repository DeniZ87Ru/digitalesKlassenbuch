package com.example.demo.Service;

import com.example.demo.Model.Dozent;

import java.util.List;

public interface DozentServices {

    List<Dozent> getAllDozenten();

    Dozent saveDozent(Dozent dozent);

    Dozent getDozentById(Long id);

    Dozent updateDozent(Dozent dozent);

    void deleteDozentById(Long id);
}
