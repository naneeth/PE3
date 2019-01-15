package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StudentMarksTest {

    StudentMarks studentMarks;

    @Before
    public void setUp() {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() {
        studentMarks = null;
    }

    @Test
    public void testStudentMarksSuccess() {
        int studentArray[] = {100, 55, 60, 45};

        String actualValue = studentMarks.isInRange(4, studentArray);
        String expectedValue = "Grades are in range";
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void testStudentMarksSuccess1() {
        int studentArray[] = {100, 55, 160, 45};
        int numberOfStudents = 4;
        String actualValue = studentMarks.isInRange(numberOfStudents, studentArray);
        String expectedValue = "Error! grades are not in range";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testStudentMarksFailure1() {
        int studentArray[] = {100, 55, 16, 45};
        int numberOfStudents = 4;
        String actualValue = studentMarks.isInRange(numberOfStudents, studentArray);
        String expectedValue = "Error! grades are not in range";
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testStudentMarksNotNull() {
        int numberOfStudents = 4;
        int studentArray[] = {};
        String actualValue = studentMarks.isInRange(numberOfStudents, studentArray);
        numberOfStudents = 0;
        actualValue = studentMarks.isInRange(numberOfStudents, studentArray);
        String expectedValue = null;
        assertEquals(expectedValue, actualValue);
    }
        @Test
        public void testStudentMarksFailure2() {
        int[] negativeStudentArray = {40, -4, 56, 89};
        int numberOfStudents = 4;
        String actualValue = studentMarks.isInRange(numberOfStudents, negativeStudentArray);
        String expectedValue = "Grades are not in range";
        assertNotEquals(expectedValue, actualValue);
    }

}