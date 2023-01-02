package de.hebk.menu.GUI;
import de.hebk.menu.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartGUI extends JFrame{
    private JPanel rootPanel;
    private JButton singelplayerButton;
    private JButton button2;
    private JButton helpButton;
    private JTextField werWirdMillionaerTextField;
    private JButton Scoreboard;


    public StartGUI(String name){
        super(name);
        this.add(rootPanel);
        this.setSize(800,800);
        this.setVisible(true);

        singelplayerButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button Pressed");
                rootPanel.setVisible(false);
                singlePlayer();
            }
        });
    }

    private void singlePlayer() {
        Menu.fragen(rootPanel);
    }
}
