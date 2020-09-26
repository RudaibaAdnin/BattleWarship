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
public class circle_draw2
{   
    int[][] matrix;
    Group group1;
    int n=11;
    circle_draw2(int[][] matrix,Group group1)
    {
     this.matrix=matrix;
     this.group1=group1;   
    }
    void circle_draw_for_player2()
    {
       for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {   
                
                
                if(matrix[i][j]==2)//drawing circle sign when matrix value is 2 and there is ship
                {
               Circle c=new Circle(750+50*i+25,50+50*j+25,15);
               c.setFill(Color.BLUE);
               group1.getChildren().add(c); 
                
               }
               
                if(matrix[i][j]==3)//drawing cross sign when matrix value is 3 and there is no ship
                {
               Line line=new Line(750+50*i+10,50+50*j+15,750+50*i+30,50+50*j+35);
               Line line1=new Line(750+50*i+10,50+50*j+35,750+50*i+30,50+50*j+15);
               line.setStroke(Color.BLUE);
               line1.setStroke(Color.BLUE);
               group1.getChildren().add(line); 
               group1.getChildren().add(line1); 
                
               }
            }
        }   
    }
}
