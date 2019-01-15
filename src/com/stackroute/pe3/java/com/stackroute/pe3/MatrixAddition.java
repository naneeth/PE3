package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;
/*
Write a program to compute the addition of two matrix,
Read the number of rows and columns as input, also the values of each matrix.
 */
public class MatrixAddition {
    public boolean isValid(int matrix[][]) {
        boolean b = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0].length != matrix[i].length) {
                b = false;
                break;
            }
        }
        return b;
    }

    public List<Integer> addition(int row, int column, int matrix1[][], int matrix2[][]) {
        int[][] matrix = new int[row][column];
        List<Integer> sum = new ArrayList<>();
        int column1 = matrix1[0].length;
        int row1 = matrix1.length;
        int column2 = matrix2[0].length;
        int row2 = matrix2.length;
        if (column1 == column2 && column2 == column && row1 == row2 && row2 == row && isValid(matrix1) && isValid(matrix2)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                    sum.add(matrix[i][j]);
                }

            }
            return sum;
        } else {

            return null;
        }
    }
}
