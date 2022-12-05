package de.hebk.menu;

import de.hebk.menu.CSVReader.CSVReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String path;

    public Menu() {
        path = "";
        config();
    }

    private void config() {
        System.out.println("Geben Sie den Pfad der CSV-Datei an");
        Scanner sc = new Scanner(System.in);
        path = sc.nextLine();
        CSVReader reader = new CSVReader();
        ArrayList<String> list = reader.loadFile(path);
        System.out.println(list);

    }
}
