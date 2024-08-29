import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class Calculator2 extends JFrame {
    // Declaration of all calculator components
    JPanel windowContent;
    JTextField displayField;

    // Constructor where all components are created and added to the frame
    Calculator2() {
        // Create the panel and set it as the content pane
        windowContent = new JPanel();
        this.setContentPane(windowContent);
        
        // Set GridBagLayout for the window panel
        GridBagLayout gb = new GridBagLayout();
        windowContent.setLayout(gb);

        // Create an instance of the class GridBagConstraints
        GridBagConstraints constr = new GridBagConstraints();

        // Set constraints for the display field
        constr.gridx = 0;
        constr.gridy = 0;
        constr.gridheight = 1;
        constr.gridwidth = 6;
        constr.fill = GridBagConstraints.BOTH;
        constr.weightx = 1.0;
        constr.weighty = 1.0;
        constr.anchor = GridBagConstraints.CENTER;

        displayField = new JTextField();
        gb.setConstraints(displayField, constr);
        windowContent.add(displayField);

        // Setup frame properties
        this.setSize(400, 300);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}