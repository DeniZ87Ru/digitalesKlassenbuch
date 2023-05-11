package com.example.demo.Model;

import jakarta.persistence.*;
import java.util.Vector;

@Entity
@Table(name = "dozent")
public class Dozent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vor_name")
    private String vorname;
    @Column(name = "nach_name")
    private String nachname;
    @Column(name = "email")
    private String email;
    @Column(name = "unterschrift_name")
    private boolean unterschrift;
    @Column(name = "isLoggedIn_name")
    private static boolean isLoggedIn;
    Vector<Dozent> dozentVector;

    private static final String USERNAME = "Börny";

    private static final String PASSWORD = "1234";


    public Dozent() {

    }

    public Dozent(String firstName, String lastName, String email) {
        super();
        this.vorname = firstName;
        this.nachname = lastName;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUnterschrift(boolean unterschrift) {
        this.unterschrift = unterschrift;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public void setDozentVector(Vector<Dozent> dozentVector) {
        this.dozentVector = dozentVector;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getEmail() {
        return email;
    }

    public boolean isUnterschrift() {
        return unterschrift;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public Vector<Dozent> getDozentVector() {
        return dozentVector;
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public Long getId() {
        return id;
    }
}
