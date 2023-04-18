package com.company;
import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinate for the first point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y coordinate for the first point: ");
        double y1 = input.nextDouble();

        Point point1 = new Point(x1,y1);

        System.out.print("Enter the x coordinate for the second point: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y coordinate for the second point: ");
        double y2 = input.nextDouble();

        Point point2 = new Point(x2,y2);
    }
}
