package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Vector;
@Entity
@Table(name = "teilnehmende")
public class Teilnehmende {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vor_name")
    private String vorname;
    @Column(name = "nach_name")
    private String nachname;
    @Column(name = "email")
    private String email;
    Vector<Teilnehmende> teilnehmendeVector;

    public Teilnehmende() {

    }

    public Teilnehmende(String vorname, String nachname, String email) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Vector<Teilnehmende> getTeilnehmendeVector() {
        return teilnehmendeVector;
    }

    public void setTeilnehmendeVector(Vector<Teilnehmende> teilnehmendeVector) {
        this.teilnehmendeVector = teilnehmendeVector;
    }

}
