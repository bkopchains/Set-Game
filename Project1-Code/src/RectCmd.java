import java.awt.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 *
 * a command class to handle events upon the "Rectangle" button press
 */
public class RectCmd extends Command {

    private Rect currentRect;
    private Point pressed;

    public RectCmd(){}

    public void executePress(Point mousePoint, drawing dwg){
        currentRect = new Rect(mousePoint.x, mousePoint.y, 10, 10, dwg.getColor());
        dwg.addShape(currentRect);
        pressed = mousePoint;
    }

    public void executeDrag(Point mousePoint, drawing dwg) {
        currentRect.setLeft(Math.min(mousePoint.x, pressed.x));
        currentRect.setTop(Math.min(mousePoint.y, pressed.y));
        currentRect.setWidth(Math.abs(mousePoint.x - pressed.x));
        currentRect.setHeight(Math.abs(mousePoint.y - pressed.y));
    }
}
