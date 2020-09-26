/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Asus
 */
public class draw_grid_for_player2{
    Group rectangles=new Group();
    Group root;
    int[][] matrix;
    int n=11;
    draw_grid_for_player2(int[][] matrix1,Group root){
        this.matrix=matrix1;
        this.root=root;
    }
    
    void drawing_grid_for_player2(){    
         
        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                 Rectangle rectangle=new Rectangle(750+50*i,50+50*j,50,50);
                 rectangle.setFill(Color.AQUA);
                 rectangle.setStroke(Color.BLACK);
                 rectangles.getChildren().add(rectangle);
                 root.getChildren().add(rectangle);
               }
                if(matrix[i][j]==1)
                {
                 Rectangle rectangle=new Rectangle(750+50*i,50+50*j,50,50);
                 System.out.println("Rectangle X and Y is  ="+50*i+" "+50*j);
                 rectangle.setFill(Color.AQUA);
                 rectangle.setStroke(Color.BLACK);
                 rectangles.getChildren().add(rectangle);
                 root.getChildren().add(rectangle);
                
               }
                
                
               
            }
        }
    }
}

