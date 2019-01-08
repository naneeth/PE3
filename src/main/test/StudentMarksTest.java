import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class StudentMarksTest {

    StudentMarks studentMarks;

    @Before
    public void setUp()
    {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown()
    {
        studentMarks = null;
    }

    @Test
    public void testStudentMarksSuccess()
    {
        int studentArray[]={100,55,60,45};

        String actualValue =studentMarks.isInRange(4,studentArray);
        String expectedValue="Grades are in range";
        assertEquals(expectedValue,actualValue);


    }


    @Test
    public void testStudentMarksFailure()
    {
        int studentArray[]={100,55,160,45};
        int numberOfStudents=4;
        String actualValue =studentMarks.isInRange(numberOfStudents,studentArray);
        String expectedValue="Error! grades are not in range";
        assertEquals(expectedValue,actualValue);

        int emptyStudentArray[]={};
        numberOfStudents=0;
        actualValue =studentMarks.isInRange(numberOfStudents,emptyStudentArray);
        expectedValue=null;
        assertEquals(expectedValue,actualValue);

        int[] negativeStudentArray={40,-4,56,89};
        numberOfStudents=4;
        actualValue =studentMarks.isInRange(numberOfStudents,negativeStudentArray);
        expectedValue="Error! grades are not in range";
        assertEquals(expectedValue,actualValue);

    }

    @Test(expected = ArithmeticException.class)
    public void testInvalidValue()
    {
        int[] errorStudentArray = {40 / 0, 98, 56, 89};
        String actualValue = studentMarks.isInRange(4,errorStudentArray);

    }

}