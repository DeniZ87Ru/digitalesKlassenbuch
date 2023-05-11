package com.example.demo.Repository;

import com.example.demo.Model.Lernthemen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LernthemenRepository extends JpaRepository<Lernthemen, Long> {
}
