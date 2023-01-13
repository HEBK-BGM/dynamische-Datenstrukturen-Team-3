package de.hebk.menu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartGUI extends JFrame{
    /**
     * Attribute
     */
    private JPanel panel1;
    private JButton singelplayerButton;
    private JButton button2;
    private JButton helpButton;
    private JTextField werWirdMillionaerTextField;
    private JButton Scoreboard;
    private JButton anmeldeButton;

    /**
     * Konstruktor für die StartGUI mit einem Namen
     * @param name Name der StartGUI
     */
    public StartGUI(String name){
        super(name);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        /**
         * ActionListener für den Singleplayer-Button
         */
        singelplayerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                remove(panel1);
                new Fragenlayout(StartGUI.this, 1);
            }
        });

        /**
         * ActionListener für den Help-Button
         */
        helpButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Help Button Pressed");
                //remove(panel1);
                new Help();
            }
        });

        /**
         * ActionListener für den Anmelde-Button
         */
        anmeldeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Anmelden Button Pressed");
                remove(panel1);
                new Anmeldung(StartGUI.this);
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
