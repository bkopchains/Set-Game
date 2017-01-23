import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 *
 * a command class to handle events upon the "blue" button press
 */
public class BlueCmd extends Command {

    public BlueCmd(){}

    public void executeClick(Point p, drawing dwg) {
        if (dwg.getFrontmostContainer(p) != null)
        dwg.getFrontmostContainer(p).setColor(Color.blue);
    }

}
