package Fixtures.TestClasses;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionalTest {
    public int i;
    public int j;
    
    // This method runs before every test
    @Before
    public void setUp() {
        i = 1;
        j = 2;
    }

    // This method runs after every test
    @After
    public void tearDown() {
        i = 0;
        j = 0;
    }
    
    @Test
    public void testMethod() {
        //i = 1;
        //j = 2;
        assertEquals(i + j, 3);
        System.out.println("Test method");
    }
}
