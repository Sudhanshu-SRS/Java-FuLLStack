package bank;
// Required imports for GUI and file handling
import javax.swing.*;  // For GUI components like JFrame, JButton, etc.
import java.awt.*;      // For layout (BorderLayout, GridLayout, etc.)
import java.awt.event.*; // For event handling (like button clicks)
import java.io.*;       // For serialization and file input/output
import java.util.*;     // For utility classes (like ArrayList, Random)

// 👤 This class represents a bank account
class Account implements Serializable {
    // Serialization ID helps during deserialization to check version compatibility
    private static final long serialVersionUID = 1L;

    // Account data fields
    String name;         // Name of the account holder
    int accNo;           // Unique account number
    double balance;      // Current balance in the account
    ArrayList<String> transactions = new ArrayList<>(); // List to keep track of all deposits/withdrawals

    // Constructor to create a new account
    public Account(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;  // Initial balance is ₹0
        transactions.add("Account Created for " + name); // Log account creation
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;  // Increase balance
        transactions.add("Deposited: ₹" + amount); // Log the transaction
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;  // Deduct amount if enough balance
            transactions.add("Withdrawn: ₹" + amount);
        } else {
            transactions.add("Failed Withdrawal: ₹" + amount + " (Insufficient Funds)"); // Log failure
        }
    }

    // Method to get full statement (all transactions)
    public String getStatement() {
        return String.join("\n", transactions); // Join all entries with new lines
    }
}

// 🏦 Main GUI class for bank operations
public class Bank1 extends JFrame {

    // GUI components
    JTextArea output;                       // Shows messages, balance, history
    JTextField nameField, accField, amountField; // Input fields for name, account no, and amount
    JButton openBtn, depositBtn, withdrawBtn, checkBtn, exitBtn; // Buttons for actions

    // Constructor - This sets up the GUI
    public Bank1() {
        setTitle("Bank3 - GUI ATM/CDM"); // Title of the window
        setSize(500, 450);               // Size of the window
        setLayout(new BorderLayout());   // Layout manager
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Close app on clicking X

        // === 🔼 INPUT PANEL: Top section ===
        JPanel inputPanel = new JPanel(new GridLayout(4, 2)); // 4 rows, 2 columns

        // Adding Name input
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        // Adding Account No input
        inputPanel.add(new JLabel("Account No:"));
        accField = new JTextField();
        inputPanel.add(accField);

        // Adding Amount input
        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        inputPanel.add(amountField);

        // Add inputPanel to the top of the window
        add(inputPanel, BorderLayout.NORTH);

        // === ▶️ BUTTON PANEL: Middle section ===
        JPanel btnPanel = new JPanel(new GridLayout(1, 5)); // 1 row, 5 buttons

        // Create buttons
        openBtn = new JButton("Open");
        withdrawBtn = new JButton("Withdraw");
        depositBtn = new JButton("Deposit");
        checkBtn = new JButton("Check");
        exitBtn = new JButton("Exit");

        // Add buttons to the panel
        btnPanel.add(openBtn);
        btnPanel.add(withdrawBtn);
        btnPanel.add(depositBtn);
        btnPanel.add(checkBtn);
        btnPanel.add(exitBtn);

        // Add button panel to center of the window
        add(btnPanel, BorderLayout.CENTER);

        // === 🔽 OUTPUT PANEL: Bottom section ===
        output = new JTextArea(); // For showing output
        output.setEditable(false); // Can't type in it
        add(new JScrollPane(output), BorderLayout.SOUTH); // Add with scrollbar

        // === 🧠 Button Logic ===
        // When buttons are clicked, these methods are called
        openBtn.addActionListener(e -> openAccount());
        depositBtn.addActionListener(e -> depositMoney());
        withdrawBtn.addActionListener(e -> withdrawMoney());
        checkBtn.addActionListener(e -> checkBalance());
        exitBtn.addActionListener(e -> System.exit(0)); // Close app

        setVisible(true); // Show the window
    }

    // ✅ Create new account
    private void openAccount() {
        String name = nameField.getText().trim(); // Get user input
        int accNo = new Random().nextInt(100000); // Random 5-digit acc no

        if (!name.isEmpty()) {
            Account acc = new Account(name, accNo); // Create account object
            saveAccount(acc); // Save it to file
            output.setText("Account created for " + name + " with Account No: " + accNo); // Show message
        } else {
            output.setText("Enter a valid name!");
        }
    }

    // 💰 Deposit money to account
    private void depositMoney() {
        Account acc = loadAccount(); // Load account file
        if (acc != null) {
            try {
                double amount = Double.parseDouble(amountField.getText().trim()); // Get amount
                acc.deposit(amount); // Deposit
                saveAccount(acc); // Save updated account
                output.setText("Deposited ₹" + amount + "\nBalance: ₹" + acc.balance);
            } catch (Exception e) {
                output.setText("Invalid amount");
            }
        }
    }

    // 💸 Withdraw money from account
    private void withdrawMoney() {
        Account acc = loadAccount();
        if (acc != null) {
            try {
                double amount = Double.parseDouble(amountField.getText().trim());
                acc.withdraw(amount); // Try to withdraw
                saveAccount(acc);
                output.setText("Attempted Withdrawal of ₹" + amount + "\nBalance: ₹" + acc.balance);
            } catch (Exception e) {
                output.setText("Invalid amount");
            }
        }
    }

    // 📊 Check balance and transaction history
    private void checkBalance() {
        Account acc = loadAccount();
        if (acc != null) {
            output.setText("Name: " + acc.name +
                    "\nAccount No: " + acc.accNo +
                    "\nBalance: ₹" + acc.balance +
                    "\n\nTransaction History:\n" + acc.getStatement());
        }
    }

    // 🔁 Load account from .ser file
    private Account loadAccount() {
        try {
            int accNo = Integer.parseInt(accField.getText().trim()); // Read acc no
            FileInputStream file = new FileInputStream("./Bank/Bank_V3/acc_" + accNo + ".ser");
            ObjectInputStream in = new ObjectInputStream(file);
            Account acc = (Account) in.readObject(); // Convert file back to object
            in.close();
            file.close();
            return acc;
        } catch (Exception e) {
            output.setText("Account not found or error loading!");
            return null;
        }
    }

    // 💾 Save account to .ser file
    private void saveAccount(Account acc) {
        try {
            File folder = new File("./Bank/Bank_V3/");
            if (!folder.exists()) folder.mkdirs(); // Create folder if it doesn't exist

            FileOutputStream file = new FileOutputStream("./Bank/Bank_V3/acc_" + acc.accNo + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(acc); // Save object to file
            out.close();
            file.close();
        } catch (IOException e) {
            output.setText("Error saving account!");
        }
    }

    // 🚀 Start the app
    public static void main(String[] args) {
        new Bank1(); // Create window and start everything
    }
}
