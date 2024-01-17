package models;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double xInput, double yInput){
        this.x = xInput;
        this.y = yInput;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point secondPoint){
        double res = 0;
        double diffX = pow(this.x - secondPoint.x,2);
        double diffY = pow(this.y - secondPoint.y,2);
        res = sqrt(diffX+diffY);
        return res;
    }


    // toString

    @Override
    public String toString() {
        return "Enter the number(:"+this.x +" "+this.y + ")";
    }
}
