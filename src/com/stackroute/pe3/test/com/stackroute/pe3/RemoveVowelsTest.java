package com.stackroute.pe3;

import com.stackroute.pe3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels obj;

    @Before
    public void setUp() {
        obj = new RemoveVowels();
    }

    @Test
    public void removeVowelsTestSuccess() {

        List<String> expectedValue = new ArrayList(Arrays.asList("Ind", "Untd Stts", "Itly", "", "Hydrbd"));
        String[] actual = {"India", "United States", "Italy", "aeiou", "Hyderabad"};
        List<String> actualValue = obj.removeVowel(actual);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void removeVowelsTestFailure() {

        List<String> expectedValue = new ArrayList(Arrays.asList("heu", "Units", "Idtiy", "nan", "Haebd"));
        String[] actual = {"aheadu", "Units", "Idtioy", "naneeth", "Hyderabad"};
        List<String> actualValue = obj.removeVowel(actual);
        //Assert
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void removeVowelsNotNull() {
        List<String> expectedValue = null;
        String[] actual = null;

        List<String> actualValue = obj.removeVowel(actual);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @After
    public void tearDown() {
        obj = null;
    }

}