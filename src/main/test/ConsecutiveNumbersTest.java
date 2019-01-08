import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {


        ConsecutiveNumbers obj;
        @Before
        public void setUp(){
            obj= new ConsecutiveNumbers();
        }

        @Test
        public void consecutiveNumbersTestSuccess(){

            String expectedValue = "1,2,3,4,5,6,7 are consecutive numbers";
            String actualValue   = obj.isConsecutive("1,2,3,4,5,6,7");
            //Assert
            assertEquals(expectedValue,actualValue);

        }

    @Test
    public void consecutiveNumbersTestFailure(){

        String expectedValue = "1,2,3,4,5,6,6 are not consecutive numbers";
        String actualValue   = obj.isConsecutive("1,2,3,4,5,6,6");
        //Assert
        assertEquals(expectedValue,actualValue);

    }
        @After
        public void tearDown(){
            obj = null;
        }

    }