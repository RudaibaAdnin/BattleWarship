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
public class draw_grid_for_player1{
    Group rectangles=new Group();
    Group root;
    int[][] matrix;
    int n=11;
    draw_grid_for_player1(int[][] matrix1,Group root){
        this.matrix=matrix1;
        this.root=root;
    }
    
    void drawing_grid_for_player1(){    
            for(int i=0;i<n;i++)
        {   
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==1)
                {
                 Rectangle rectangle=new Rectangle(150+50*i,50+50*j,50,50);
                 rectangle.setFill(Color.AQUA);
                 rectangle.setStroke(Color.BLACK);
               
                 root.getChildren().add(rectangle);
               }
              
                
                
               
            }
        }
      
    }
}
