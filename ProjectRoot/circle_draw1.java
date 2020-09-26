/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Asus
 */
public class circle_draw1
{   
    int[][] matrix;
    Group design;
    int n=11;
    circle_draw1(int[][] matrix,Group group1)
    {
     this.matrix=matrix;
     this.design=group1;   
    }
    void circle_draw_for_player1()
    {
       for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {  
               
                
                
              
                if(matrix[i][j]==3)//drawing circle sign when matrix value is 2 and there is ship
                {
               Circle c=new Circle(150+50*i+25,50+50*j+25,15);
               c.setFill(Color.BLUE);
               design.getChildren().add(c); 
                
               }
               
                if(matrix[i][j]==4)//drawing cross sign when matrix value is 3 and there is no ship
                {
               Line line=new Line(150+50*i+10,50+50*j+15,150+50*i+30,50+50*j+35);
               Line line1=new Line(150+50*i+10,50+50*j+35,150+50*i+30,50+50*j+15);
               line.setStroke(Color.BLUE);
               line1.setStroke(Color.BLUE);
               design.getChildren().add(line); 
               design.getChildren().add(line1); 
                
               }
            }
        }   
    }
}
