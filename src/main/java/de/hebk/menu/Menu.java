package de.hebk.menu;
import de.hebk.menu.GUI.StartGUI;
import de.hebk.menu.GUI.Fragenlayout;
import de.hebk.menu.GUI.Joker;
import de.hebk.menu.GUI.Help;
import de.hebk.menu.GUI.Fragenlayout;

import de.hebk.menu.CSVReader.CSVReader;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int i;
    /**
     * Konstruktor für das Menu
     */
    public static void main(String[] args) {
        // User user = new User();
        CSVReader csv = new CSVReader();

        StartGUI guiStart = new StartGUI("Wer wird Millionaer");
        }

        public static void fragen(JPanel pannel1){
            Fragenlayout fragen = new Fragenlayout("Frage " + i, pannel1);
            i++;
        }

        public static void joker(){
        Joker joker1 = new Joker();
        }

}
