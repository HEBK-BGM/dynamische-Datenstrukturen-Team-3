package de.hebk.menu.CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    /**
     * Attribute
     */
    String path = "src/main/java/de/hebk/menu/CSVReader/Questions.csv";

    /**
     * Konstruktor für CSVReader
     */
    public CSVReader() {
        loadFile(path);
    }

    /**
     * Diese Methode liest die CSV-Datei mit den Fragen, indem sie jede Zeile der Datei durchgeht und einer Liste hinzufügt.
     * @param path Dateipfad
     * @return Zurückgegebene Liste
     */
    public ArrayList<String> loadFile(String path) {
        File file = new File(path);
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s = "";

            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public String getPath() {
        return this.path;
    }
}
