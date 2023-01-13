package de.hebk.menu.GUI;

import de.hebk.menu.Texte;
import de.hebk.menu.GUI.StartGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help extends JFrame{
    private StartGUI frame;
    private JTextField hierMussDieSpielanleitungTextField; //ToDo hierMussDieSpielanleitungTextField
    private JPanel panel1;
    private JTextArea textArea1;

    public Help(){
        this.add(panel1);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        Font schriftart = new Font("Papyrus", Font.BOLD + Font.ITALIC, 20);
        textArea1.setText(Texte.anleitung);
        textArea1.setFont(schriftart);
        textArea1.setForeground(Color.WHITE);
        this.setVisible(true);
    }

    public JPanel Panel(){
        return panel1;
    }
}
