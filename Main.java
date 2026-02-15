import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new BorderLayout());

        // Top panel for input fields
        JPanel inputPanel = new JPanel();
        JTextField num1Field = new JTextField(5);
        JTextField num2Field = new JTextField(5);
        inputPanel.add(num1Field);
        inputPanel.add(num2Field);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Middle panel for + and - buttons
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Label at the bottom for result
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        // Event for + button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Event for - button
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int diff = num1 - num2;
                    resultLabel.setText("Result: " + diff);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
