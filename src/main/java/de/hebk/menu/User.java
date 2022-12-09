package de.hebk.menu;

import java.util.Scanner;

public class User {

    /**
     * Attribute
     */
    private String name;
    private double punktzahl;

    /**
     * Konstruktor für User
     */
    public User() {
        anmeldung();
    }

    /**
     * Anmeldung für jeden User
     */
    private void anmeldung() {
        Scanner sc = new Scanner(System.in);
        breakLine();
        System.out.println("Herzlich Willkommen bei Wer wird Millionär?");
        breakLine();
        System.out.println("Wie ist Ihr Name?");
        breakLine();
        this.name = sc.nextLine();
        System.out.println("Willkommen bei Wer wird Millionär?, " + getName());
        breakLine();
        System.out.println("Unten links finden Sie einen Hilfe-Knopf, der Ihnen einen kurzen Überblick über das Spiel verschafft.");
        System.out.println("Außerdem können Sie sowohl im Einzel-, als auch im Mehrspielermodus spielen.");
        System.out.println("Um das Spiel zu starten, wählen Sie bitte einen Spielmodus aus.");
        breakLine();
    }

    /**
     * BreakLine Methode als optische Verbesserung
     */
    private void breakLine() {
        System.out.println("----------------");
    }

    public String getName() {
        return this.name;
    }

    public double getPunktzahl() {
        return this.punktzahl;
    }
}
