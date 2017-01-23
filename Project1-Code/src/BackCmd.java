import java.awt.*;

/**
 * Created by Ben_Kopchains on 1/21/17.
 *
 * a command class to handle events upon the "back" button press
 */
public class BackCmd extends Command{

    Shape shape;

    public BackCmd(){}

    public void executeClick(Point mousePoint, drawing dwg) {
        shape = dwg.getFrontmostContainer(mousePoint);
        dwg.layerDown(shape);
    }

}
