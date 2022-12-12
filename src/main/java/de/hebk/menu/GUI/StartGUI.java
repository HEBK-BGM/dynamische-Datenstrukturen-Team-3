package de.hebk.menu.GUI;

import javax.swing.*;

public class StartGUI {
    private JPanel rootPanel;
    private JButton singelplayerButton;
    private JButton button2;
    private JButton helpButton;
    private JTextField werWirdMillionärTextField;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new StartGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
