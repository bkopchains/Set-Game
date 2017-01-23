import java.awt.*;

/**
 * Created by Ben_Kopchains on 1/21/17.
 */
public class MoveCmd extends Command{

    private Shape moveShape;
    private Point pressed;
    private int diffX;
    private int diffY;


    public MoveCmd(){}

    public void executePress(Point mousePoint, drawing dwg) {
        moveShape = dwg.getFrontmostContainer(mousePoint);
        pressed = mousePoint;
        diffX = moveShape.getCenter().x - pressed.x;
        diffY = moveShape.getCenter().y - pressed.y;
    }
    public void executeDrag(Point mousePoint, drawing dwg) {
        Point newCenter = new Point(mousePoint.x + diffX, mousePoint.y + diffY);
        moveShape.setCenter(newCenter);
    }


}
