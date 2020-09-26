/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

/**
 *
 * @author Asus
 */
public class condition_check_when_mouse_clicked1
{
    
    int[][] matrix;
    double x,y;
    int turn=1;
 condition_check_when_mouse_clicked1(int[][] matrix,double x,double y)
{
    this.matrix=matrix;
    this.x=x;
    this.y=y;
  //  this.turn=turn;
    
}
 void setting_condition_check_when_mouse_clicked1()
 {
      for(int i=1;i<13;i++)
        {   
            for(int j=1;j<13;j++) 
            {
              if((x>50*i&&x<50+50*i)&&(y>50*j&&y<50+50*j)&&matrix[i][j]==1&&turn==1) 
               {
                 
               matrix[i][j]=2;
               turn=2;
               
              
               }
              if((x>50*i&&x<50+50*i)&&(y>50*j&&y<50+50*j)&&matrix[i][j]==0&&turn==1) 
               {
                 
               matrix[i][j]=4;
               turn=2;
               }
              
            }
              
        }
 }
}