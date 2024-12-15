import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();

        // Create register button
        JButton registerButton = new JButton("Register");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(new JLabel()); // Empty label for spacing
        frame.add(registerButton);

        // Action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validate input
                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are required.");
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match.");
                    return;
                }

                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid email.");
                    return;
                }

                // Simulate registration success
                JOptionPane.showMessageDialog(frame, "Registration Successful!");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
