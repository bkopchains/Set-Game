import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 *
 * a command class to handle events upon the "red" button press
 */
public class RedCmd extends Command {

    public RedCmd(){}

    public void executeClick(Point p, drawing dwg) {
        if (dwg.getFrontmostContainer(p) != null)
        dwg.getFrontmostContainer(p).setColor(Color.red);
    }

}
