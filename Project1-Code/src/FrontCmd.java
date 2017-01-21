import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Ben_Kopchains on 1/21/17.
 */
public class FrontCmd extends Command{

    Shape shape;

    public FrontCmd(){}

    public void executeClick(Point mousePoint, drawing dwg) {
        shape = dwg.getFrontmostContainer(mousePoint);
        dwg.layerUp(shape);
    }

}
