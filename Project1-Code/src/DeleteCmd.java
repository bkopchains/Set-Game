import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Ben_Kopchains on 1/21/17.
 *
 * a command class to handle events upon the "Delete" button press
 */
public class DeleteCmd extends Command{

    Shape deleteShape;

    public DeleteCmd(){}

    public void executeClick(Point mousePoint, drawing dwg) {
        deleteShape = dwg.getFrontmostContainer(mousePoint);
        dwg.deleteShape(deleteShape);
    }
}
