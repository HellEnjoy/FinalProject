package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static com.company.Encoder.Encode;

public class UI extends JFrame {
    private JButton buttonA = new JButton("Encode");
    private JButton buttonB = new JButton("Decode");
    private JButton buttonC = new JButton("BruteForce");
    private JTextField input = new JTextField(5);
    private JLabel text = new JLabel("Input:");
    private JCheckBox checkBox = new JCheckBox("Check",false);

    public UI() {
        super("GUI");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(text);
        container.add(input);
        container.add(checkBox);

 //       buttonA.addActionListener
    }
}
