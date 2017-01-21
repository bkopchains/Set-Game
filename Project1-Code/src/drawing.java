import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class drawing {

    private ArrayList<Shape> shapeList;
    private Color color;

    public drawing(Color initialColor){
        color = initialColor;
        shapeList = new ArrayList();
    }

    public Shape getFrontmostContainer(Point p){
        Shape output = null;
        for (Shape shape : shapeList){
            if (shape.containsPoint(p)){
                output = shape;
            }
        }
        return output;
    }

    public void deleteShape(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index >= 0) {
            shapeList.remove(index);
        }
    }

    public void layerUp(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index < shapeList.size()-1) {
            Collections.swap(shapeList, index, index+1);
        }
    }

    public void layerDown(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index > 0) {
            Collections.swap(shapeList, index, index-1);
        }
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