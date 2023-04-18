package com.company;

public class Point {
    double x_coordinate;
    double y_coordinate;

    public Point(double x, double y){
        this.x_coordinate = x;
        this.y_coordinate = y;
    }

    public double distance(Point point, Point point2 ){
        double total_distance= Math.sqrt(Math.pow((point2.x_coordinate - point.x_coordinate),2) + Math.pow((point2.y_coordinate - point.y_coordinate),2));
        return total_distance;
    }
}
