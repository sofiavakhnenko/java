import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Calculator2 {
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
    Calculator2() {
        // set GridBagLayout for the window panel
        GridBagLayout gb = new GridBagLayout();
        this.setLayout(gb);

          // create an instance of the class GridBagConstraints
        // these lines of code need to be repeated for each component that is addored to
        // the cell
        GridBagConstraints constr = new GridBagConstraints();
        // set restrictions for the inpul line of the calculator coordinate x in the
        // table
        constr.x = 0;
        // y coordinate in the table
        constr.y = 0;
        // this cell has the same height as standard cells
        constr.gridheight = 1;
        // this cell has a width equal to the width of 6 standard cells
        constr.gridwidth = 6;
        // fill the entire space of the cell
        constr.fill = constr.BOTH;
        // horisontal proportion that the component will occupy
        constr.weightx = 1.0;
        // vertical proportion that the component will occupy
        constr.weighty = 1.0;
        // position of the component inside the call
        constr.anchor = constr.CENTER;
        
        displayField = new JTextField();
        // set constraints for the input field
        gb.setConstraints(displayField, constr);
        // add an input field to the window
        windowContent.add(displayField);
    }

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
    }
}
