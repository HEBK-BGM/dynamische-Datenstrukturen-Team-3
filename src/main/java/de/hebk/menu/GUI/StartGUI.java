package de.hebk.menu.GUI;
import de.hebk.menu.Menu;
import de.hebk.menu.GUI.Fragenlayout;

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
                new Fragenlayout(StartGUI.this);
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
    }

    public JPanel Panel(){
        return panel1;
    }
}
