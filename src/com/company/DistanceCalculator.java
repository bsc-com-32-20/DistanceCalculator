package com.company;
import java.util.Scanner;

public class DistanceCalculator {
    static int count = 1;
    public static void main(String[] args) {
        Point point1 = getPoint();

        Point point2 = getPoint();
        System.out.println("The distance between point 1 and 2 is "+ point1.distance(point2));
    }
    public static Point getPoint(){
        Scanner input = new Scanner(System.in);
        if(count==1){
        System.out.print("Enter the x coordinate for the first point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y coordinate for the first point: ");
        double y = input.nextDouble();
        count++;
        return new Point(x,y);
        }
        else {
            System.out.print("Enter the x coordinate for the second point: ");
            double x = input.nextDouble();
            System.out.print("Enter the y coordinate for the second point: ");
            double y = input.nextDouble();
            return new Point(x,y);
        }
    }
}
