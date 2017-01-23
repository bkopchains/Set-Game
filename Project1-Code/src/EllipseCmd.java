import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by Ben_Kopchains on 1/20/17.
 *
 * a command class to handle events upon the "ellipse" button press
 */
public class EllipseCmd extends Command {

    private Ellipse currentEllipse;
    private Point pressed;

    public EllipseCmd(){}

    public void executePress(Point mousePoint, drawing dwg){
        currentEllipse = new Ellipse(mousePoint.x, mousePoint.y, 10, 10, dwg.getColor());
        dwg.addShape(currentEllipse);
        pressed = mousePoint;
    }

    public void executeDrag(Point mousePoint, drawing dwg) {
        currentEllipse.setLeft(Math.min(mousePoint.x, pressed.x));
        currentEllipse.setTop(Math.min(mousePoint.y, pressed.y));
        currentEllipse.setWidth(Math.abs(mousePoint.x - pressed.x));
        currentEllipse.setHeight(Math.abs(mousePoint.y - pressed.y));
    }
}
