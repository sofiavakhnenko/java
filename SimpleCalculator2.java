import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        // create a panel
        JPanel windowContent = new JPanel();
        // set the display manager for this panel
        GridLayout gl = new GridLayout(4, 2, 5, 5);
        windowContent.setLayout(gl);
        // create components in memory
        JLabel label1 = new JLabel("Number 1");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        // add components on the panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        // create a frame and set a panel for it
        JFrame frame = new JFrame("My first Calculator");
        frame.setContentPane(windowContent);
        // set the size and make the frame visible
        frame.setSize(400, 100);
        frame.setVisible(true);
    }
}
