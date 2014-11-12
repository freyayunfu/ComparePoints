/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparepoints;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class generates 100 random points and display the points in increasing
 * order of their x-coordinates and y-coordinates.
 *
 * @author FU, Yun
 * @version 1.0
 * @since 25/10/2014
 */
public class ComparePoints {

    /**
     * Generate 100 random points and display the points in increasing order of
     * their x-coordinates and y-coordinates.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Point[] points = new Point[100];
        for (int i = 0; i < 100; i++) {
            points[i] = new Point();
        }
        System.out.println("Display the points.");
        System.out.printf("%20s%20s\n", "X", "Y");
        for (Point e : points) {
            System.out.printf("%20d%20d\n", e.getX(), e.getY());
        }
        System.out.println("");

        Arrays.sort(points);

        System.out.println("Display the points in increasing order of their x-coordinates.");
        System.out.printf("%20s%20s\n", "X", "Y");
        for (Point e : points) {
            System.out.printf("%20d%20d\n", e.getX(), e.getY());
        }

        System.out.println("");
        Arrays.sort(points, CompareY.PointComparator);
        System.out.println("Display the points in increasing order of their y-coordinates.");
        System.out.printf("%20s%20s\n", "X", "Y");
        for (Point e : points) {
            System.out.printf("%20d%20d\n", e.getX(), e.getY());
        }

    }

}
