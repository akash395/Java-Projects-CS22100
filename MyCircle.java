package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends MyShape {

    public MyCircle()
    {
        super();
    }

    public MyCircle( double x1, double y1, double x2, double y2, Color color )
    {
        super(x1, y1, x2, y2, color);
    }

    public double getRadius() 
    { 
        double length= Math.sqrt(Math.pow(getx1()-getx2(),2) + Math.pow(gety1()-gety2(),2));
        return length;
    }

    public double getArea()
    {
        double area= Math.PI * Math.pow(getRadius(), 2) ;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter= 2 * Math.PI * getRadius() ;
        return perimeter;
    }


    public String toString(int x1, int y1, int x2, int y2, Color color){

        return "Radius is " + getRadius() + ", Area is " + getArea() + ", and Perimeter is " + getPerimeter();
    }

    public void draw(GraphicsContext panel){
        panel.setFill(getcolor());
        panel.fillOval(getx1(), gety1(), getx2(), gety2());
    }
}
