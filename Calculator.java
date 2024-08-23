import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
    // declaration of all calculator components
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    // created in the constructor all components are created and added to the frame
    // using combinations
    Calculator() {
        windowContent = new JPanel();
        // set the scheme for this panel
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        // create and display a field
        // add it to the northern area of the window
        displayField = new JTextField(30);
        windowContent.add("North", displayField);
        // create buttons using a class Jbutton constrructor that takes the button text
        // as a parameter
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        /*
         * create a panel with GridLayout which contains 12 buttons - 10 buttons with
         * numbers and buttons with a
         * dot and an equal swing
         */
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);
        // add buttons to the panel p1
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        // plase the panel in the center area of the window
        windowContent.add("Center", p1);
        // create a frame and set its main panel
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        // make the window size large enough to accommodate all components
        frame.pack();
        // display window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
