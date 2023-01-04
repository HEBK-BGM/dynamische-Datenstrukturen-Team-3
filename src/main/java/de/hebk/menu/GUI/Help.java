package de.hebk.menu.GUI;

import de.hebk.menu.GUI.StartGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help {
    private StartGUI frame;
    private JTextField hierMussDieSpielanleitungTextField; //ToDo hierMussDieSpielanleitungTextField
    private JPanel panel1;
    private JButton zurueckButton;

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

    public JPanel Panel(){
        return panel1;
    }
}
