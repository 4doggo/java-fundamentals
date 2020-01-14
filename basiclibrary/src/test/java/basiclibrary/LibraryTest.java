/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testContainsDuplicates() {

        int[] testArray = new int[]{1, 2, 3, 4, 10, 10, 11, 11};
        assertTrue(BasicLibrary.containsDuplicates(testArray));
    }

    @Test
    public void testContainsDuplicatesNoDuplicates() {

        int[] testArray = new int[]{1, 2, 3, 4, 10, 11};
        assertFalse(BasicLibrary.containsDuplicates(testArray));
    }

    @Test
    public void testCalculateAverage(){

        int[] testArray = new int[]{3,6,9,12};
        assertEquals(7.5, BasicLibrary.calculateAverage(testArray), 0.01);

    }


    @Test
    public void testGetMinAndMax(){

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(BasicLibrary.getMinAndMax(weeklyMonthTemperatures));

    }


}
