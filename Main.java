package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage window) throws Exception{
        window.setTitle ("Lines,Circles and Polygons");
        Canvas canvas = new Canvas(600,600);
        GraphicsContext panel = canvas.getGraphicsContext2D();
        StackPane box = new StackPane(canvas);
        Scene scene = new Scene(box);
        window.setScene(scene);
        window.show();

      MyPolygon p1= new MyPolygon(6, 100,275,250,Color.GREY);
        p1.draw(panel);

        MyCircle c1= new MyCircle( 190,165, 170, 170, Color.YELLOW );
        c1.draw(panel);

        MyPolygon p2= new MyPolygon(6,84,275,250,Color.LIGHTGREEN);
        p2.draw(panel);

        MyCircle c2= new MyCircle(202,177,145,145,Color.PINK);
        c2.draw(panel);

        MyPolygon p3= new MyPolygon(6,71, 275,250,Color.LIGHTBLUE);
        p3.draw(panel);

        MyLine line1 = new MyLine(50, 400, 500, 400, Color.BLACK);
        line1.draw(panel);

        MyLine line2=  new MyLine(50,100,500,100,Color.BLACK);
        line2.draw(panel);

        MyLine line3= new MyLine(50,400,50,100,Color.BLACK);
        line3.draw(panel);

        MyLine line4= new MyLine(500,400,500,100,Color.BLACK);
        line4.draw(panel);

        MyLine diagonal1= new MyLine(50,400,500,100,Color.BLACK);
        diagonal1.draw(panel);

        MyLine diagonal2= new MyLine(50,100,500,400,Color.BLACK);
        diagonal2.draw(panel);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
