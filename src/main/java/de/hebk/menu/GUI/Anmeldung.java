package de.hebk.menu.GUI;
import de.hebk.menu.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Anmeldung extends JFrame implements ActionListener {

    // TODO: GUI von der StartGUI übernehmen und Name + Passwort in der StartGUI anzeigen lassen

    /**
     * Attribute
     */
    private JPanel panel;
    private JFrame frame;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton button;

    private String userName;
    private String passwort;
    public static User currentUser;

    /**
     * Konstruktor Anmeldung
     */
    public Anmeldung() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(800,800);
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
        passwordLabel.setBounds(10, 200, 160, 50);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 200, 330, 50);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 300, 160, 50);
        button.addActionListener(this);
        panel.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentUser = new User(userText.getText(), passwordText.getText());
        frame.setVisible(false);
        StartGUI start = new StartGUI("Wer wird Millionaer");
    }

    /**
     * Gibt das Panel zurück
     * @return Panel
     */
    private JPanel getPanel() {
        return panel;
    }

    /**
     * Gibt den UserName zuück
     * @return UserName
     */
    private JTextField getUserText() { return userText; }

    /**
     * Gibt das UserPasswort zurück
     * @return UserPasswort
     */
    private JPasswordField getPasswordText() { return passwordText; }
}
