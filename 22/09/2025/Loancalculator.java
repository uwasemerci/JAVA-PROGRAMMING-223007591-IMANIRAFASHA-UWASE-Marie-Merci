package com.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loancalculator implements ActionListener {
    JFrame frame;
    JLabel amount, duration, total;
    JTextField Tamount, Tduration, Ttotal;
    JButton calculate;

    public static void main(String[] args) {
        new Loancalculator();
    }

    public Loancalculator() {
        createwindow();
        setlocationandsize();
        addcomponenttoframe();
        addactionevent();
    }

    private void createwindow() {
        frame = new JFrame("Loan Calculator");
        frame.setBounds(100, 100, 400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Labels
        amount = new JLabel("Enter Amount:");
        duration = new JLabel("Enter Duration (years):");
        total = new JLabel("Total to Return:");

        // Text fields
        Tamount = new JTextField();
        Tduration = new JTextField();
        Ttotal = new JTextField();
        Ttotal.setEditable(false);

        // Button
        calculate = new JButton("Calculate");
    }

    private void setlocationandsize() {
        amount.setBounds(30, 30, 150, 30);
        Tamount.setBounds(180, 30, 150, 30);

        duration.setBounds(30, 70, 150, 30);
        Tduration.setBounds(180, 70, 150, 30);

        total.setBounds(30, 110, 150, 30);
        Ttotal.setBounds(180, 110, 150, 30);

        calculate.setBounds(120, 160, 120, 33);
    }

    private void addcomponenttoframe() {
        frame.add(amount);
        frame.add(Tamount);
        frame.add(duration);
        frame.add(Tduration);
        frame.add(total);
        frame.add(Ttotal);
        frame.add(calculate);
        frame.setVisible(true);
    }

    private void addactionevent() {
        calculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amounts = Double.parseDouble(Tamount.getText());
            int years = Integer.parseInt(Tduration.getText());
            double interestRate = 0.006; // 0.6% simple interest per year
            double total = amounts + (amounts * interestRate * years);

            Ttotal.setText(String.format("%.2f", total)); // show 2 decimals
        } catch (NumberFormatException ex) {
            Ttotal.setText("Invalid input");
        }
    }
}
