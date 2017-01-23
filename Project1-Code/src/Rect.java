import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Rectangle class - handles creation and movement of new rectangle shapes
 */

public class Rect extends Shape {

    private int left, top;
    private int width, height;
    private Color color;

    public Rect (int left, int top, int width, int height, Color color) {
        super(color);
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void drawShape(Graphics page) {
        page.fillRect(left, top, width, height);
    }

    public Point getCenter() {
        return new Point(left + (width / 2), top + (height / 2));
    }

    public void move(int deltaX, int deltaY){
        left += deltaX;
        top += deltaY;

    }

    public boolean containsPoint(Point p) {
        return pointInRect(p, left, top, width, height);
    }

    private boolean pointInRect(Point p, int left, int top, int width, int height){
        double pX = p.x;
        double pY = p.y;
        return ((pX > left && pX < (left + width)) && (pY > top && pY < (top + height)));
    }

    /**
     * For all methods below:
     *
     * setter methods for the top, left, width, and height values (respectively)
     * @param val the new value of the variable
     */

    public void setTop(int val){
        top = val;
    }
    public void setLeft(int val){
        left = val;
    }
    public void setWidth(int val){
        width = val;
    }
    public void setHeight(int val){
        height = val;
    }
}