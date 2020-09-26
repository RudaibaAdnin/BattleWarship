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
public class matrix_initial_value_for_player1
{
    int[][] matrix;
matrix_initial_value_for_player1(int[][] matrix)
{
    this.matrix=matrix;
    
}
void initial_value_for_player1()
{
      Random rand = new Random();
        
        
        //Filling first matrix with random values
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j <11; j++) {
                matrix[i][j]=1;//rand.nextInt(1);
            }
        }
}

}

