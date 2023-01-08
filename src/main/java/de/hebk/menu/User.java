package de.hebk.menu;

import java.util.Scanner;

public class User {

    /**
     * Attribute
     */
    private String name;
    private double punktzahl;

    private String passwort;

    /**
     * Konstruktor für User
     */
    public User(String name, String passwort) {
        setUserName(name);
        setPasswort(passwort);
    }

    /**
     * Getter und Setter
     */

    public String getName() {
        return this.name;
    }

    public double getPunktzahl() {
        return this.punktzahl;
    }

    public String getPasswort() { return this.passwort; }

    public void setUserName(String name) {
        this.name = name;
    }

    public void setPunktzahl(double punktzahl) {
        this.punktzahl = punktzahl;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
