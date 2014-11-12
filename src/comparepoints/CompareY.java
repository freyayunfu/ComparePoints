/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparepoints;

import java.util.Comparator;

/**
 * This class implement Comparator<Point> interface, which implement the compare
 * method to compare two points on their x-coordinates if y-coordinates are
 * identical.
 *
 * @author FU, Yun
 * @version 1.0
 * @since 25/10/2014
 */
public class CompareY implements Comparator<Point> {

    public static Comparator<Point> PointComparator = new Comparator<Point>() {

        @Override
        public int compare(Point o1, Point o2) {
            int ay = o1.getY();
            int by = o2.getY();
            if (ay == by) {
                return o1.getX() - o2.getX();
            } else {
                return ay - by;
            }

        }
    };

    @Override
    public int compare(Point o1, Point o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
