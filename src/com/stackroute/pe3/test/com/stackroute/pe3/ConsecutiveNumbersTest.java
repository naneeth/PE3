package com.stackroute.pe3;

import com.stackroute.pe3.ConsecutiveNumbers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers obj;

    @Before
    public void setUp() {
        obj = new ConsecutiveNumbers();
    }

    @Test
    public void consecutiveNumbersTestSuccess() {

        String expectedValue = "1,2,3,4,5,6,7 are consecutive numbers";
        String actualValue = obj.isConsecutive("1,2,3,4,5,6,7");
        //Assert
        Assert.assertEquals(expectedValue, actualValue);

    }

    @Test
    public void consecutiveNumbersTestFailure() {

        String expectedValue = "1,2,3,4,5,6,6 are not consecutive numbers";
        String actualValue = obj.isConsecutive("1,2,3,4,5,6,6");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @After
    public void tearDown() {
        obj = null;
    }


    @Test
    public void testConsecutiveNumbersSuccess() {
        String expectedValue = "21,22,23,24,25,26,27 are consecutive numbers", actualValue;
        actualValue = obj.isConsecutive("21,22,23,24,25,26,27");
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void testConsecutiveNumbersFailure() {
        String expectedValue = "21,22,23,24,25,26,27,28 are consecutive numbers", actualValue;
        actualValue = obj.isConsecutive("21,22,23,24,25,26,27");
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testConsecutiveNumbersForCharInput() {
        String expectedValue = null, actualValue;
        actualValue = obj.isConsecutive("a,22,23,24,25,26,27,28");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testConsecutiveNumberForSpecialCharecters() {
        String expectedValue = null, actualValue;
        actualValue = obj.isConsecutive("_,22,23,$,25,26,27,28");
        assertEquals(expectedValue, actualValue);
    }

}