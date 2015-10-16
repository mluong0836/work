/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_methodsmadness;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Luong_7_methodsmadness extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBackground(gc,0,0,300,250);
        drawRectangles(gc,40,50,60,70);       
        drawCircle(gc);
        drawTriangle(gc);
        drawmoreRectangles(gc,160,50,60,70);
        drawmoreCircles(gc);
        drawSmile(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawBackground(GraphicsContext gc, int x, int y, int w, int h) {
        gc.setFill(Color.BLUE);
        gc.fillRect( x , y, w, h);
    }

    private void drawRectangles(GraphicsContext drawRectangles, int x, int y, int w, int h) {
        drawRectangles.setFill(Color.ORANGE);
        drawRectangles.fillRect(x, y, w, h);
        drawRectangles.setStroke(Color.BLACK);
    }
    private void drawCircle(GraphicsContext gc) {
        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.RED);
        gc.fillOval(56,70,30,30);
        
    }
   private void drawTriangle(GraphicsContext gc) {
     double [] myX = {160,110,130};
     double [] myY = {155,145,175};
     gc.fillPolygon(myX, myY,3);
     gc.setFill(Color.RED);
     gc.setStroke(Color.PURPLE);
    }
   private void drawmoreRectangles(GraphicsContext gc,int x, int y, int w, int h) {
       gc.setFill(Color.ORANGE);
       gc.setStroke(Color.PURPLE);
       gc.fillRect(x,y,w,h);
   }
     private void drawmoreCircles(GraphicsContext gc) {
       gc.setFill(Color.YELLOW);
       gc.setStroke(Color.RED);
       gc.fillOval(178,71,30,30);
   }
     private void drawCircle(GraphicsContext gc, int x, int y) {
           gc.setFill(Color.DEEPPINK);
      gc.setStroke(Color.AQUA);
      gc.fillOval(x, y, 20, 20);
     }
   private void drawSmile(GraphicsContext gc) {
     
       double [] Xs = {60,70,80,95,105,115,125,135,145,155,165,175,185};
       double [] Ys = {200,205,205,205,205,205,205,205,205,205,205,200};
       for (int i = 0; i < 12; i++) {
           drawCircle(gc, (int) Xs[i],(int)Ys[i]);
                   }
      
       
       
   }
}


       
   
   
       /*
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
     
*/



