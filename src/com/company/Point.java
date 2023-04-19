package com.company;

public class Point {
    double x_coordinate;
    double y_coordinate;

    public Point(double x, double y){
        this.x_coordinate = x;
        this.y_coordinate = y;
    }

    public double distance(Point point ){
        double total_distance= Math.sqrt(Math.pow((point.x_coordinate - this.x_coordinate),2) + Math.pow((point.y_coordinate - this.y_coordinate),2));
        return total_distance;
    }
}

