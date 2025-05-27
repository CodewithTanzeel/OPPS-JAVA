/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.*;
import javafx.stage.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Control.*;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class JAVAFXWORKSHOP {

   GraphicsContext gc;
    
    Color[] colors = {Color.RED,Color.GREEN,Color.BLACK};
    int colorIdx = 0;

    public static void main(String[] args) {
       //Starting the Application
      launch(args);
    }

    //Overide the Start Method;
    public void Start(Stage myStage) {
        
        // Give the Stage title.
        myStage.setTitle("Draw Directly to a Canvas.");
        
         //Use a flowPane for the root node. In this case ,
        //vertical and horizontal gaps in 10;
        FlowPane rootNode = new FlowPane(10,10);
        
        // Center the Controls in the Scene.
        rootNode.setAlignment(Pos.CENTER);
        
        //Create a Scene
        Scene myScene = new Scene(rootNode,300,100);
        
        
        // set the Scene on the Stage
        myStage.setScene(myScene);
        
        //Create a Canvas 
        Canvas myCanvas = new Canvas(400,400);
        
        // Get the Graphics context for the canvas.
        gc = myCanvas.getGraphicsContext2D();
        
        
        // Create a button. 
        Button btnChangeColor= new Button("Change Color");
        
        //Handle the action events for the Change color Action events.
        btnChangeColor.setOnAction(new EventHandler<ActionEvent> (){
            
            public void handle(ActionEvent ae) {
                // set the Stroke fill color;
                gc.setStroke(colors[colorIdx]);
                 gc.setFill(colors[colorIdx]);
                //ReDraw the line , text , and filed rectangle in the
                // new color . this leaves the color of the other nodes
                // unchanged
                
                gc.strokeLine(0,0,200,200);
                gc.fillText(" This is drawn on the canves",60,50);
                gc.fillRect(100,320,300,40);
                
                
                // Change the Color.
                colorIdx++;
                if(colorIdx == colors.length)colorIdx = 0;
                               
            }
        });
        
        
        //Draw initial output  on the canvas.
        gc.strokeLine(0, 0, 200, 200);
        gc.strokeOval(100, 100, 200, 200);
        gc.strokeRect(0, 200, 50, 200);
        gc.fillOval(0, 0, 20, 20);
        gc.fillRect(0, 0, 20, 20);
        
        // Set the Font Size to 20 and Draw Text.
        gc.setFont(new Font(20));
        gc.fillText("This is Drawn on the Canvas.",60,50);
        
        
        //Add the Canvas button and Scene to the Graph.
        rootNode.getChildren().addAll(myCanvas,btnChangeColor);
        
        
        
        //Show the Stage and its Scene
        
        myStage.show();
        
        
        
        
    }

    
    
}
