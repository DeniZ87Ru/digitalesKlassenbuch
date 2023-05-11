package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "lernthemen")
public class Lernthemen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String lernthemen;

    public Lernthemen(){

    }

    public Lernthemen(String fach) {
        super();
        this.lernthemen = lernthemen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLernthemen() {
        return lernthemen;
    }

    public void setLernthemen(String lernthemen) {
        this.lernthemen = lernthemen;
    }
}



