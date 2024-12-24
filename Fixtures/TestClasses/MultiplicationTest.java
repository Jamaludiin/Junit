package Fixtures.TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

    public int k;
    public int l;

    // This method runs before every test
    @Before
    public void setUp() {
        k = 1;
        l = 2;
    }

    // This method runs after every test
    @After
    public void tearDown() {
        k = 0;
        l = 0;
    }
    
    @Test
    public void testMethod() {
        //k = 2;
        //l = 3;
        assertEquals(k * l, 6);
        System.out.println("Test method");
    }
}
