package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

// Serializable bank class
class Bank2 implements Serializable {
    private static final long serialVersionUID = 1L;

    double paisa = 30000; // Suruvatcha balance

    public void withdraw(double amount) {
        if (amount <= paisa) {
            paisa -= amount;
        }
    }

    public void deposit(double amount) {
        paisa += amount;
    }

    public double getBalance() {
        return paisa;
    }
}

public class Bank2_GUI extends JFrame {
    private Bank2 account;
    private JTextField amountField;
    private JTextArea outputArea;
    private final String FILE_PATH = "./Bank/Bank_V2/Bank2.ser";

    public Bank2_GUI() {
        setTitle("Bank2 - Simple GUI");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Load account from file or create new
        account = loadAccount();
        if (account == null) {
            account = new Bank2(); // new object if not found
        }

        // === Input Panel ===
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField(10);
        inputPanel.add(amountField);
        add(inputPanel, BorderLayout.NORTH);

        // === Buttons Panel ===
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        JButton withdrawBtn = new JButton("Withdraw");
        JButton depositBtn = new JButton("Deposit");
        JButton checkBtn = new JButton("Check Balance");

        buttonPanel.add(withdrawBtn);
        buttonPanel.add(depositBtn);
        buttonPanel.add(checkBtn);
        add(buttonPanel, BorderLayout.CENTER);

        // === Output Panel ===
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // === Action Listeners ===
        withdrawBtn.addActionListener(e -> {
            double amt = getAmount();
            if (amt > 0) {
                if (amt <= account.getBalance()) {
                    account.withdraw(amt);
                    saveAccount(account);
                    outputArea.setText("Withdrawn: ₹" + amt + "\nUpdated Balance: ₹" + account.getBalance());
                } else {
                    outputArea.setText("Insufficient Balance!");
                }
            }
        });

        depositBtn.addActionListener(e -> {
            double amt = getAmount();
            if (amt > 0) {
                account.deposit(amt);
                saveAccount(account);
                outputArea.setText("Deposited: ₹" + amt + "\nUpdated Balance: ₹" + account.getBalance());
            }
        });

        checkBtn.addActionListener(e -> {
            outputArea.setText("Current Balance: ₹" + account.getBalance());
        });

        setVisible(true);
    }

    private double getAmount() {
        try {
            return Double.parseDouble(amountField.getText().trim());
        } catch (NumberFormatException e) {
            outputArea.setText("Please enter a valid amount.");
            return -1;
        }
    }

    private void saveAccount(Bank2 acc) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(acc);
            oos.close();
            fos.close();
        } catch (IOException e) {
            outputArea.setText("Error saving account.");
        }
    }

    private Bank2 loadAccount() {
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Bank2 acc = (Bank2) ois.readObject();
            ois.close();
            fis.close();
            return acc;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        new Bank2_GUI();
    }
}
