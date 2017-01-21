import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 */
public class GreenCmd extends Command {

    public GreenCmd(){}

    public void executeClick(Point p, drawing dwg) {
        dwg.getFrontmostContainer(p).setColor(Color.green);
    }

}
