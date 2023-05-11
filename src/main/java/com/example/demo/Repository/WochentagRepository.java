package com.example.demo.Repository;


import com.example.demo.Model.Wochentag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WochentagRepository extends JpaRepository<Wochentag, Long> {
}