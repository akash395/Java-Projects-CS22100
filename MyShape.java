package sample;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class MyShape {
    private double x1,y1,x2,y2;
    private Color color;

    //default constructor
    public MyShape () {
        x1=0;
        x2=0;
        y1=0;
        y2=0;
        color=Color.BLACK;
    }
    //overriden constructor
    public MyShape(double x1, double y1, double x2, double y2, Color color)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.color=color;
    }

    //Set Functions
    public void setx1(double x1)
    {
        this.x1=x1;
    }

    public void sety1(double y1)
    {
        this.y1=y1;
    }

    public void setx2(double x2)
    {
        this.x2=x2;
    }

    public void sety2(double y2)
    {
        this.y2=y2;
    }

    public void setcolor(Color color)
    {
        this.color=color;
    }

    public String getCenter()
    {
        return "X- coord is " + getx1() + " and y-coord is " +gety1();
    }

    //Get functions
    public double getx1()
    {
        return x1;
    }

    public double gety1()
    {
        return y1;
    }

    public double getx2()
    {
        return x2;
    }

    public double gety2()
    {
        return y2;
    }

    public Color getcolor()
    {
        return color;
    }

    //for returning object's description as a String
    public String toString(double x1, double y1, double x2, double y2, Color color){
        return "X1:- " + getx1() + ", Y1:- " + gety1() + ", X2:- " + getx2() + ", Y2:- " + gety2();
    };

    //Draw Function
   public void draw( GraphicsContext panel ){};
}

