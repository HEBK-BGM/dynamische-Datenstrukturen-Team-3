package de.hebk.menu.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fragenlayout{
    /**
     * Attribute
     */
    private StartGUI frame;
    private JTextPane Geldanzeige;
    private JPanel panel1;
    private JTextPane Fragennummer;
    private JButton jokerButton;
    private JTextField Frage;
    private JButton Antwort_1;
    private JButton Antwort_2;
    private JButton Antwort_3;
    private JButton Antwort_4;
    private JButton menueButton;

    /**
     * Konstruktor für das Fragenlayout mit der GUI der StartGUI und der übergebenen Fragen-ID
     * @param gui GUI der StartGUI
     * @param frageNr Fragen-ID
     */
    public Fragenlayout(StartGUI gui, int frageNr){
        this.frame = gui;
        frame.add(panel1);
        frame.setVisible(true);

        /**
         * ActionListener für den Joker-Button
         */
        jokerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                frame.remove(panel1);
                Joker joker = new Joker(frame, frageNr);
            }
        });

        /**
         * ActionListener für den Menue-Button
         */
        menueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Menue Button Pressed");
                frame.setVisible(false);
                StartGUI start = new StartGUI("Wer wird Millionaer");
            }
        });
    }

    /**
     * Gibt das Panel zurück
     * @return Panel
     */
    private JPanel getPanel() {
        return panel1;
    }
}
