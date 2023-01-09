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
     * Gibt den Namen zurück
     * @return Name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gibt die Punktzahl zurück
     * @return Punktzahl
     */
    public double getPunktzahl() {
        return this.punktzahl;
    }

    /**
     * Gibt das Passwort zurück
     * @return Passwort
     */
    public String getPasswort() { return this.passwort; }

    /**
     * Setzt den UserName mit dem übergebenen Namen
     * @param name UserName
     */
    public void setUserName(String name) {
        this.name = name;
    }

    /**
     * Setzt die Punktzahl mit der übergebenen Punktzahl
     * @param punktzahl
     */
    public void setPunktzahl(double punktzahl) {
        this.punktzahl = punktzahl;
    }

    /**
     * Setzt das Passwort mit dem übergebenen Passwort
     * @param passwort
     */
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
