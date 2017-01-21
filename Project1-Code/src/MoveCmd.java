import java.awt.*;

/**
 * Created by Ben_Kopchains on 1/21/17.
 */
public class MoveCmd extends Command{

    private Shape moveShape;
    //private Point pressed;


    public MoveCmd(){}

    public void executePress(Point mousePoint, drawing dwg) {
        moveShape = dwg.getFrontmostContainer(mousePoint);
        //pressed = mousePoint;
    }
    public void executeDrag(Point mousePoint, drawing dwg) {
        moveShape.move(mousePoint.x, mousePoint.y);
    }


}
