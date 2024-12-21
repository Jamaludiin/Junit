package TestConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMethodsTest {
    SimpleMethods simpleMethods;

    @Test
    public void testGetScore() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        assertEquals(95, simpleMethods.getScore());
    }   

    @Test
    public void testGetGradeA() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        assertEquals('A', simpleMethods.getGrade());
    }

    @Test
    public void testSetScore() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        assertEquals(95, simpleMethods.getScore());
    }

    @Test
    public void testGetGradeAallRange() {
        simpleMethods = new SimpleMethods();
        
        for (int i = 79; i < 90; i++) {
            simpleMethods.setScore(i);
            assertEquals('B', simpleMethods.getGrade());
            // this fails but the result or output is confsuing: java.lang.AssertionError: expected:<66> but was:<67>
            // this is because the value of B is 66 and the value of C is 67. so the test fails and you need to understand the conversion of char to ascii.
        }
        
    }

    @Test
    public void testGetGradeCallRange() {
        simpleMethods = new SimpleMethods();
        for (int i = 70; i < 80; i++) {
            simpleMethods.setScore(i);
            assertEquals('C', simpleMethods.getGrade());
        }
        
    }


    @Test
    public void testGetGradeDRange() {
        simpleMethods = new SimpleMethods();
        for (int i = 60; i < 70; i++) {
            simpleMethods.setScore(i);
            assertEquals('D', simpleMethods.getGrade());
        }
        
    }
}
