/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg0_battlewarship;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class matrix_initial_value_for_player2
{
    int[][] matrix2;
    int rect_x;
matrix_initial_value_for_player2(int[][] matrix)
{
    this.matrix2=matrix;
    
}
void initial_value_for_player2()
{
    
       Random rand = new Random();
        
         for (int i = 0; i <11; i++) {
            for (int j =0; j <11; j++) {
                matrix2[i][j]=rand.nextInt(1);
            }
        }
        //Filling first matrix with random values
         rect_x=rand.nextInt(5);
           System.out.println("hello"+rect_x);
         if(rect_x==2){
            matrix2[2][3]=1;
            matrix2[2][4]=1;
            matrix2[2][5]=1;
            matrix2[2][6]=1;
            matrix2[2][7]=1;
            matrix2[6][3]=1;
            matrix2[7][3]=1;
            matrix2[8][3]=1;
            matrix2[9][3]=1;
            matrix2[4][3]=1;
            matrix2[4][4]=1;
            matrix2[4][5]=1;
            matrix2[9][9]=1;
            matrix2[9][10]=1;
            matrix2[8][5]=1;
         }
           if(rect_x==1){
            matrix2[2][5]=1;
            matrix2[2][6]=1;
            matrix2[2][7]=1;
            matrix2[2][8]=1;
            matrix2[2][9]=1;
            matrix2[6][8]=1;
            matrix2[7][8]=1;
            matrix2[8][8]=1;
            matrix2[9][8]=1;
            matrix2[4][3]=1;
            matrix2[4][4]=1;
            matrix2[4][5]=1;
            matrix2[5][9]=1;
            matrix2[5][10]=1;
            matrix2[10][9]=1;
         }
            if(rect_x==0){
            matrix2[4][5]=1;
            matrix2[4][6]=1;
            matrix2[4][7]=1;
            matrix2[4][8]=1;
            matrix2[4][9]=1;
            matrix2[1][2]=1;
            matrix2[2][2]=1;
            matrix2[3][2]=1;
            matrix2[4][2]=1;
            matrix2[7][3]=1;
            matrix2[7][4]=1;
            matrix2[7][5]=1;
            matrix2[5][6]=1;
            matrix2[5][7]=1;
            matrix2[10][8]=1;
         }
            if(rect_x==3){
            matrix2[5][5]=1;
            matrix2[5][6]=1;
            matrix2[5][7]=1;
            matrix2[5][8]=1;
            matrix2[5][9]=1;
            matrix2[2][2]=1;
            matrix2[3][2]=1;
            matrix2[4][2]=1;
            matrix2[8][2]=1;
            matrix2[8][3]=1;
            matrix2[8][4]=1;
            matrix2[8][5]=1;
            matrix2[6][6]=1;
            matrix2[6][7]=1;
            matrix2[8][8]=1;
         }
            if(rect_x==4){
            matrix2[7][5]=1;
            matrix2[7][6]=1;
            matrix2[7][7]=1;
            matrix2[7][8]=1;
            matrix2[7][9]=1;
            matrix2[1][2]=1;
            matrix2[2][2]=1;
            matrix2[3][2]=1;
            matrix2[4][2]=1;
            matrix2[6][3]=1;
            matrix2[6][4]=1;
            matrix2[6][5]=1;
            matrix2[8][6]=1;
            matrix2[8][7]=1;
            matrix2[9][8]=1;
         }
           
           
         
       
}

}


