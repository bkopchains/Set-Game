
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class drawing {

    private ArrayList<Shape> shapeList;
    private Color color;

    /**
     * Initializes the list of drawings
     * @param initialColor - initial color that drawings will appear in
     */
    public drawing(Color initialColor){
        color = initialColor;
        shapeList = new ArrayList();
    }

    /**
     * gets the front-most shape underneath the given point
     * @param p a given point (generally the mouse pointer)
     * @return the frontmost shape under the point
     */
    public Shape getFrontmostContainer(Point p){
        Shape output = null;
        for (Shape shape : shapeList){
            if (shape.containsPoint(p)){
                output = shape;
            }
        }
        return output;
    }

    /**
     * iterates through the shape list and removes a specific shape
     * @param shape to be removed
     */
    public void deleteShape(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index >= 0) {
            shapeList.remove(index);
        }
    }

    /**
     * shifts the input shape up one layer
     * @param shape to be shifted
     */
    public void layerUp(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index < shapeList.size()-1) {
            Collections.swap(shapeList, index, index+1);
        }
    }

    /**
     * shifts the input shape down one layer
     * @param shape to be shifted
     */
    public void layerDown(Shape shape){
        int index = shapeList.indexOf(shape);
        if (index > 0) {
            Collections.swap(shapeList, index, index-1);
        }
    }

    /**
     * displays all shapes in the list on the canvas
     * @param graphics the selected canvas to display the shapes on
     */
    public void draw(Graphics graphics){
        for (Shape shape : shapeList)
            shape.draw(graphics);
    }

    /**
     * adds a shape to the shapelist
     * @param shape to add
     */
    public void addShape (Shape shape){
        shapeList.add(shape);
    }

    /**
     * returns the current color
     * @return
     */
    public Color getColor(){
        return color;
    }

    /**
     * sets the current color
     * @param input a color value
     */
    public void setColor(Color input){
        color = input;
    }
}