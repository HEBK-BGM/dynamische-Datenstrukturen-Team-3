package de.hebk.menu.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Anmeldung extends JFrame implements ActionListener {

    private JPanel panel;
    private JFrame frame;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton button;
    private JLabel success;
    public Anmeldung(StartGUI gui) {
        this.frame = gui;
        frame.add(panel);
        frame.setVisible(true);
        /*
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Name");
        userLabel.setBounds(10, 20, 170, 50);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 330, 50);
        panel.add(userText);

        passwordLabel = new JLabel("Passwort");
        passwordLabel.setBounds(10, 50, 160, 50);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 330, 50);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 160, 50);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,600,50);
        panel.add(success);

        frame.setVisible(true);
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        StartGUI start = new StartGUI("Wer wird Millionaer");
    }

    private JPanel getPanel() {
        return panel;
    }
}
