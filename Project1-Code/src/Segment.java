import java.awt.*;

/**
 * Segment.java
 * Class for a line segment.
 * 
 * Written by THC for CS 5 Lab Assignment 3.
 *
 * @author Thomas H. Cormen
 * @see Shape
 */
public class Segment extends Shape {

  private int y1, x1;
  private int x2, y2;
  private Color color;

  public Segment (int x1, int y1, int x2, int y2, Color color){
    super(color);
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  // Helper method that returns true if Point p is within a tolerance of a
  // given bounding box. Here, the bounding box is given by the coordinates of
  // its x1, y1, right, and bottom.
  private static boolean almostContainsPoint(Point p, int x1, int y1,
      int right, int bottom, double tolerance) {
    return p.x >= x1 - tolerance && p.y >= y1 - tolerance
        && p.x <= right + tolerance && p.y <= bottom + tolerance;
  }

  // Helper method that returns the distance from Point p to the line
  // containing a line segment whose endpoints are given.
  private static double distanceToPoint(Point p, int x1, int y1, int x2,
      int y2) {
    if (x1 == x2) // vertical segment?
      return (double) (Math.abs(p.x - x1)); // yes, use horizontal distance
    else if (y1 == y2) // horizontal segment?
      return (double) (Math.abs(p.y - y1)); // yes, use vertical distance
    else {
      // Here, we know that the segment is neither vertical nor
      // horizontal.
      // Compute m, the slope of the line containing the segment.
      double m = ((double) (y1 - y2)) / ((double) (x1 - x2));

      // Compute mperp, the slope of the line perpendicular to the
      // segment.
      double mperp = -1.0 / m;

      // Compute the (x, y) intersection of the line containing the
      // segment and the line that is perpendicular to the segment and that
      // contains Point p.
      double x = (((double) y1) - ((double) p.y) - (m * x1) + (mperp * p.x))
          / (mperp - m);
      double y = m * (x - x1) + y1;

      // Return the distance between Point p and (x, y).
      return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
  }

  public Point getCenter() {
    return new Point(((x1 + x2) / 2), ((y1 + y2) / 2));
  }

  public void move(int deltaX, int deltaY){
    x1 += deltaX;
    y1 += deltaY;
  }

  public void drawShape(Graphics page){
    page.drawLine(x1, y1, x2, y2);
  }

  public boolean containsPoint(Point p){
    return true;
  }

  public void setTop(int val){
    y1 = val;
  }
  public void setLeft(int val){
    x1 = val;
  }
  public void setWidth(int val){
    x2 = val;
  }
  public void setHeight(int val){
    y2 = val;
  }
}
