package com.example.demo.Repository;


import com.example.demo.Model.Dozent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DozentRepository extends JpaRepository<Dozent, Long> {
}