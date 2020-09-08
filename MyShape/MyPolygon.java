package sample;
import java.lang.Math;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class MyPolygon extends MyShape {
    private int numSides;
    private int radius;
    private int centerx;
    private int centery;
    private Color color;


    public MyPolygon(int numSides, int radius, int centerx, int centery, Color color )
    {   this.numSides= numSides;
        this.radius = radius;
        this.centerx= centerx;
        this.centery= centery;
        this.color=color;
    }

    public double getRadius() { return radius; }

    public double getSide()
    {
        double side = 2 * radius * Math.tan(180.0/numSides);
        return side;
    }

    public double getPerimeter()
    {
        double perimeter= getSide() * numSides;
        return perimeter;
    }
    public double getArea()
    {
        double area= (1.0/2.0) * radius * getPerimeter();
        return area;
    }

    public double getAngle ()
    {
        double angle;
        if (numSides>2)  angle = 2* 180.0 / numSides;
        else {angle = 0;}
        return angle;
    }


    public String toString(int x1, int y1, int x2, int y2, Color color){

        return "Side length is " + getSide()
                + ", Area is " + getArea()
                + ", Perimeter is " + getPerimeter()
                + ", and angle is " + getAngle();
    }

    public void draw (GraphicsContext panel) {
        double [] xPoints= new double[this.numSides]; //array for x coordinates vertices
        double [] yPoints= new double[this.numSides]; //array for y coordinates vertices
        double angle1 = (numSides - 1) * getAngle();
        double angle_increment = (2*Math.PI)/this.numSides;
        int i;
        for (i = 0; i < numSides; i++) { //for getting the x and y vertices of polygon
            xPoints[i] = (double) (centerx + ( radius * Math.cos(angle1) ) );
            yPoints[i] = (double) (centery + ( radius * Math.sin(angle1) ) );
            angle1 += angle_increment;
        }
     panel.setFill(this.color);
     panel.strokePolygon(xPoints,yPoints,numSides);
     panel.fillPolygon(xPoints, yPoints, numSides);
    }
    }


