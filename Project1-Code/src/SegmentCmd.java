import java.awt.*;

/**
 * Created by Ben_Kopchains on 1/20/17.
 */
public class SegmentCmd extends Command {

    private Segment currentSegment;
    private Point pressed;

    public SegmentCmd(){}

    public void executePress(Point mousePoint, drawing dwg){
        currentSegment = new Segment(mousePoint.x, mousePoint.y, mousePoint.x, mousePoint.y, dwg.getColor());
        dwg.addShape(currentSegment);
        pressed = mousePoint;
    }

    public void executeDrag(Point mousePoint, drawing dwg) {

        if (pressed.x < mousePoint.x){
            currentSegment.setLeft(pressed.x);
            currentSegment.setTop(pressed.y);
            currentSegment.setWidth(mousePoint.x);
            currentSegment.setHeight(mousePoint.y);
        }
        else {
            currentSegment.setLeft(mousePoint.x);
            currentSegment.setTop(mousePoint.y);
            currentSegment.setWidth(pressed.x);
            currentSegment.setHeight(pressed.y);
        }
    }
}
