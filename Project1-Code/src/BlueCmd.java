import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 */
public class BlueCmd extends Command {

    public BlueCmd(){}

    public void executeClick(Point p, drawing dwg) {
        if (dwg.getFrontmostContainer(p) != null)
        dwg.getFrontmostContainer(p).setColor(Color.blue);
    }

}
