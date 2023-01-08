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
     * Konstruktor für das Fragenlayout mit der GUI von der Klasse StartGUI
     * @param gui GUI von der StartGUI
     */
    public Fragenlayout(StartGUI gui){
        this.frame = gui;
        frame.add(panel1);
        frame.setVisible(true);

        jokerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                frame.remove(panel1);
                Joker joker = new Joker(frame);
            }
        });

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
