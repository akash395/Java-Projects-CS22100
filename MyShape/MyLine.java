package sample;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape {

    //Constructors
    public MyLine()
    {
        super();
    }

    public MyLine(double x1, double y1, double x2, double y2, Color color )
    {
        super(x1, y1, x2, y2, color);
    }

    public double getlength() {
        double lengthOfLine= Math.sqrt(Math.pow(getx1()-getx2(),2) + Math.pow(gety1()-gety2(),2));
        return lengthOfLine;
    }

    public double get_xAngle()
    {
        double slope= (double) (gety1() - gety2()) / (getx1() - getx2());
        double radian= Math.atan((slope));
        double degree= radian * 180/(Math.PI);
        return degree;
    }

    public String toString(double x1, double y1, double x2, double y2, Color color){
        String angleToString= Double.toString(get_xAngle());
        String length = Double.toString(getlength());
        return "Length is "+ length +" and angle is " + angleToString;
    }

    public void draw(GraphicsContext panel){
        panel.setStroke(getcolor());
        panel.setLineWidth(3);
        panel.strokeLine(getx1(), gety1(), getx2(), gety2());
    }
}
