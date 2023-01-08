package de.hebk.menu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartGUI extends JFrame{
    private JPanel panel1;
    private JButton singelplayerButton;
    private JButton button2;
    private JButton helpButton;
    private JTextField werWirdMillionaerTextField;
    private JButton Scoreboard;
    private JButton anmeldeButton;


    public StartGUI(String name){
        super(name);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        singelplayerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                remove(panel1);
                new Fragenlayout(StartGUI.this, 1);
            }
        });

        helpButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Help Button Pressed");
                remove(panel1);
                new Help(StartGUI.this);
            }
        });

        anmeldeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Anmelden Button Pressed");
                remove(panel1);
                new Anmeldung(StartGUI.this);
            }
        });
    }

    public JPanel Panel(){
        return panel1;
    }
}
