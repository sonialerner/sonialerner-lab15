import javax.swing.*;
import  java.awt.*;

/*
 * JComboBox : for selecting the rotor numbers
 * JTextField : for selecting the start of the rotors
 * JTextArea : for providing input to and output from Enigma
 * JButton : for selecting encrypt or decrypt
 * JLabel : for including other text references, such as “Inner” or “Middle”
 */

public class EnigmaFrame extends JFrame {

    JFrame f = new JFrame();

    JPanel top;
    JPanel middle;
    JPanel bottom;

    JLabel innerJLabel ;
    JComboBox<String> innerCB;
    JLabel middleJLabel;
    JComboBox<String> middleCB;
    JLabel outerJLabel;
    JComboBox<String> outerCB;

    JLabel initialPositionsJLabel;
    JTextField initialPositionsTF;

    JButton encryptButton;
    JButton decryptButton;

    JLabel inputLabel;
    JTextArea inputText;
    JLabel outputLabel;
    JTextArea outputText;

    public EnigmaFrame() {

        top = new JPanel();
        middle = new JPanel();
        bottom = new JPanel();

        innerJLabel = new JLabel("Inner");
        innerCB = new JComboBox<>();
        innerCB.addItem("1");
        innerCB.addItem("2");
        innerCB.addItem("3");
        innerCB.addItem("4");
        innerCB.addItem("5");

        middleJLabel = new JLabel("Middle");
        middleCB = new JComboBox<>();
        middleCB.addItem("1");
        middleCB.addItem("2");
        middleCB.addItem("3");
        middleCB.addItem("4");
        middleCB.addItem("5");

        outerJLabel = new JLabel("Outer");
        outerCB = new JComboBox<>();
        outerCB.addItem("1");
        outerCB.addItem("2");
        outerCB.addItem("3");
        outerCB.addItem("4");
        outerCB.addItem("5");

        initialPositionsJLabel = new JLabel("Initial Positions");
        initialPositionsTF = new JTextField();
        initialPositionsTF.setPreferredSize(new Dimension( 50, 28));
    
        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        
        top.add(innerJLabel);
        top.add(innerCB);
        top.add(middleJLabel);
        top.add(middleCB);
        top.add(outerJLabel);
        top.add(outerCB);
        top.add(initialPositionsJLabel);
        top.add(initialPositionsTF);
        top.add(encryptButton);
        top.add(decryptButton);
        
        
        f.add(top, BorderLayout.NORTH);
        
        inputLabel = new JLabel("Input");
        inputText = new JTextArea();
        inputText.setPreferredSize(new Dimension(500, 75));
        
        middle.add(inputLabel, BorderLayout.WEST);
        middle.add(inputText, BorderLayout.CENTER);
        
        f.add(middle, BorderLayout.CENTER);

        outputLabel = new JLabel("Output");
        outputText = new JTextArea();
        outputText.setPreferredSize(new Dimension(500, 75));

        bottom.add(outputLabel, BorderLayout.WEST);
        bottom.add(outputText);

        f.add(bottom, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
    }
}