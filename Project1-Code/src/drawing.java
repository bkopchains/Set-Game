import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class drawing {

    private ArrayList<Shape> shapeList;
    private Color color;

    public drawing(Color initialColor){
        color = initialColor;
        shapeList = new ArrayList();
    }

    public Shape getFrontmostContainer(Point p){
        return null;
    }

    public void draw(Graphics graphics){
        for (Shape shape : shapeList)
            shape.draw(graphics);
    }

    public void addShape (Shape shape){
        shapeList.add(shape);
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color input){
        color = input;
    }
}