package models;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private ArrayList<Point> cont = new ArrayList<Point>();


    // addPoint(Point) - adds to the container
    public void addPoint(Point func){
        cont.add(func);
    }


    // calculatePerimeter()

    public double calculatePerimeter(){
        double per = 0;
        for (int i = 0; i < cont.size()-1; i++) {
            Point ran = cont.get(i+1);
        per = per + cont.get(i).distance(ran);
        }
        Point contr = cont.get(cont.size()-1);
        per =per + cont.get(0).distance(contr);
    return per;}


    // getAverageSide()
    public double gerAverageSide(){
        double rep = 0;
        rep = calculatePerimeter() / cont.size();
        return rep;
    }

    // getLongestSide()
    public double getLongestSide(){
        double longest = 0;
        double ra = 0;
        for (int i = 0; i < cont.size()-1; i++) {
            Point ran = cont.get(i+1);
            if (longest < cont.get(i).distance(ran)){
                longest = cont.get(i).distance(ran);
            }
        }
        Point contr = cont.get(cont.size()-1);
        if (longest < cont.get(0).distance(contr)){
            longest = cont.get(0).distance(contr);
        }
    return longest;
    }
}
