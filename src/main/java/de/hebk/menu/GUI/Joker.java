package de.hebk.menu.GUI;

import de.hebk.menu.GUI.Fragenlayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Joker{

    /**
     * Attribute
     */
    private StartGUI frame;
    private JPanel panel1;
    private JTextArea welchenJokerMoechtestDuTextArea;
    private JButton a5050Button;
    private JButton telefonjokerButton;
    private JButton publikumsjokerButton;
    private JButton zurueckButton;

    /**
     * Konstruktor für die Joker mit der GUI von der StartGUI
     * @param gui GUI von der StartGUI
     */
    public Joker(StartGUI gui) {
        this.frame = gui;
        frame.add(panel1);
        frame.setVisible(true);

        zurueckButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Zurueck Button Pressed");
                frame.remove(panel1);
                Fragenlayout fragen = new Fragenlayout(frame); // TODO: Muss noch geändert werden, dass der genau auf die vorherige frage zurueck geht
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
