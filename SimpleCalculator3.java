//for example 
import javax.swing.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class SimpleCalculator3 {
    public static void main(String[] args) {
        // set GridBagLayout for window panel
        GridBagLayout gb = new GridBagLayout();
        this.setLayout(gb);
        // create an instanse of the class GridBagConstraints
        // these lines of code need to be repeated for each component that is added to
        // the cell
        GridBagConstraints constr = new GridBagConstraints();
        // set restrictions for the input iine of the calculator coordinate x in the
        // table
        constr.x = 0;
        // coordinate y in the table
        constr.y = 0;
        // the cell has the same height as a standard cell
        constr.gridheight = 1;
        // the cell has a width equal to the width of 6 standard cells
        constr.gridwidth = 6;
        // fill the entire cell space
        constr.fill = constr.BOTH;
        // the horizontal proportion that the component will occupy
        constr.weightx = 1.0;
        // the vertical proportion that the component will occupy
        constr.weighty = 1.0;
        // position of the component within the cell
        constr.anchor = constr.CENTER;
        displayField = new JTextField();
        // set restrictions for the input field
        gb.setConstraints(displayField, constr);
        // add the input field to the window
        windowContent.add(displayField);
    }
}