import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
        return true; // change this
    }

    private boolean pointInRect(Point p, int left, int top, int width, int height){
        return true; // change this
    }

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