package de.hebk.menu.GUI;

import de.hebk.menu.GUI.StartGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help {
    /**
     * Attribute
     */
    private StartGUI frame;
    private JTextField hierMussDieSpielanleitungTextField; //ToDo hierMussDieSpielanleitungTextField
    private JPanel panel1;
    private JButton zurueckButton;

    /**
     * Konstruktor für die Hilfe mit der GUI von der StartGUI
     * @param gui GUI von der StartGUI
     */

    public Help(StartGUI gui){
        this.frame = gui;
        frame.add(panel1);
        frame.setVisible(true);

        zurueckButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Zurueck Button Pressed");
                frame.setVisible(false);
                StartGUI start = new StartGUI("Wer wird Millionaer");
            }
        });
    }

    /**
     * Gibt das Panel zurück
     * @return Panel
     */
    public JPanel Panel(){
        return panel1;
    }
}
