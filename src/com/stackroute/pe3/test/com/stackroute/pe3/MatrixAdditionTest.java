package com.stackroute.pe3;

import com.stackroute.pe3.MatrixAddition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition obj;

    @Before
    public void setUp() {
        obj = new MatrixAddition();
    }

    @Test
    public void matrixAdditionTestSuccess() {
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrix2 = {{9, 8}, {7, 6}, {5, 4}};
        List<Integer> expectedValue = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 10, 10));
        List<Integer> actualValue = obj.addition(3, 2, matrix1, matrix2);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void matrixAdditionTestFailure() {
        int[][] matrix1 = {{9, 2}, {4, 7}, {5, 6}};
        int[][] matrix2 = {{1, 8}, {2, 5}, {0, 3}};
        List<Integer> expectedValue = new ArrayList<>(Arrays.asList(10, 0, 6, 12, 5, 9));
        List<Integer> actualValue = obj.addition(3, 2, matrix1, matrix2);
        //Assert
        assertNotEquals(expectedValue, actualValue);}

        @Test
        public void matrixAdditionTestFailure1() {
            int[][] matrix1 = {{9, 2, 6, 2}, {4, 7}, {5, 6}};
            int[][] matrix2 = {{1, 8}, {2, 5}, {0, 3, 9, 6}};
            List<Integer> expectedValue = null;
            List<Integer> actualValue = obj.addition(3, 2, matrix1, matrix2);
            //Assert
            assertEquals(expectedValue, actualValue);
        }
        @After
        public void tearDown () {
            obj = null;
        }
    }
