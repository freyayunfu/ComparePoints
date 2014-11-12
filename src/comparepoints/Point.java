/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparepoints;

/**
 * This class create the points with x and y and implement the comparable
 * interface for comparing the points on x-coordinates and y-coordinates if
 * x-coordinates are identical.
 *
 * @author FU, Yun
 * @version 1.0
 * @since 25/10/2014
 */
public class Point implements Comparable<Point> {

    int x;
    int y;
    Point point;

    /**
     *
     * construct a Point;
     */
    public Point() {
        x = (int) (Math.random() * 100);
        y = (int) (Math.random() * 100);

    }

    /**
     *
     * get the x-coordinate of point
     *
     * @return x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     *
     * get the y-coordinate of point
     *
     * @return y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     *
     * implement the comparable interface for comparing the points on
     * x-coordinates and y-coordinates if x-coordinates are identical
     *
     * @return 0 if this object equals to p, negative if this object smaller
     * than p, positive if this object bigger than p
     */
    public int compareTo(Point p) {
        int compareX = ((Point) p).getX();
        if (this.x == compareX) {
            return this.y - p.getY();
        } else {
            return this.x - compareX;
        }

    }
}
