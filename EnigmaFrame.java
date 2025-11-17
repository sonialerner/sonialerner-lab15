import javax.swing.*;
import  java.awt.*;

/*
 * JComboBox : for selecting the rotor numbers
 * JTextField : for selecting the start of the rotors
 * JTextArea : for providing input to and output from Enigma
 * JButton : for selecting encrypt or decrypt
 * JLabel : for including other text references, such as “Inner” or “Middle”
 */

public class EnigmaFrame extends JFrame{

    JFrame f = new JFrame();

    public EnigmaFrame() {

        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        JLabel innerJLabel = new JLabel("Inner");
        JComboBox<String> innerCB = new JComboBox<>();
        JLabel middleJLabel = new JLabel("Middle");
        JComboBox<String> middleCB = new JComboBox<>();
        JLabel outerJLabel = new JLabel("Outer");
        JComboBox<String> outerCB = new JComboBox<>();

        JLabel initialPositionsJLabel = new JLabel("Initial Positions");
        JTextField initialPositionsTF = new JTextField();
        initialPositionsTF.setPreferredSize(new Dimension( 50, 28));
    
        JButton encryptButton = new JButton("Encrypt");
        JButton decrypButton = new JButton("Decrypt");
        
        top.add(innerJLabel);
        top.add(innerCB);
        top.add(middleJLabel);
        top.add(middleCB);
        top.add(outerJLabel);
        top.add(outerCB);
        top.add(initialPositionsJLabel);
        top.add(initialPositionsTF);
        top.add(encryptButton);
        top.add(decrypButton);
        
        
        f.add(top, BorderLayout.NORTH);
        
        JLabel inputLabel = new JLabel("Input");
        JTextArea inputText = new JTextArea();
        inputText.setPreferredSize(new Dimension(500, 75));
        
        middle.add(inputLabel, BorderLayout.WEST);
        middle.add(inputText, BorderLayout.CENTER);
        
        f.add(middle, BorderLayout.CENTER);

        JLabel outputLabel = new JLabel("Output");
        JTextArea outputText = new JTextArea();
        outputText.setPreferredSize(new Dimension(500, 75));

        bottom.add(outputLabel, BorderLayout.WEST);
        bottom.add(outputText);

        f.add(bottom, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
    }
}