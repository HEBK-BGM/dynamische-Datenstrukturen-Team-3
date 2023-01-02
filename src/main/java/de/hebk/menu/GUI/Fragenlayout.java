package de.hebk.menu.GUI;
import de.hebk.menu.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fragenlayout extends JFrame{
    private JTextPane Geldanzeige;
    private JPanel Pannel1;
    private JTextPane Fragennummer;
    private JButton jokerButton;
    private JTextField Frage;
    private JButton Antwort_1;
    private JButton Antwort_2;
    private JButton Antwort_3;
    private JButton Antwort_4;

    public Fragenlayout(String Name, JPanel pannel2){ // Der soll Pannel2 einfach als Pannel 1 benutzen
        this.add(Pannel1);
        this.setSize(800,800);
        this.setVisible(true);

        jokerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                Pannel1.setVisible(false);
                joker();
            }
        });
    }

    public void joker(){
        Menu.joker();
    }
}
