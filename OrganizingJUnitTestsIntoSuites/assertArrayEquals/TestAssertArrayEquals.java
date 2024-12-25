package OrganizingJUnitTestsIntoSuites.assertArrayEquals;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestAssertArrayEquals {
    

    @Test
    public void testArrayEquals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        assertArrayEquals(array1, array2); // Passes because the arrays are equal
        // this method is used to check if two arrays are equal
        // if the arrays are equal, the test passes
        // if the arrays are not equal, the test fails
        
    }

    @Test
    public void testArrayEquals2() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual); // Passes because arrays are equal
    }
    
}
