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

    // positive test
    @Test
    public void testGetGradeA() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        assertEquals('A', simpleMethods.getGrade());
    }

    // positive test
    @Test
    public void testSetScore() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        assertEquals(95, simpleMethods.getScore());
    }

    // negative test
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

    // positive test
    @Test
    public void testGetGradeCallRange() {
        simpleMethods = new SimpleMethods();
        for (int i = 70; i < 80; i++) {
            simpleMethods.setScore(i);
            assertEquals('C', simpleMethods.getGrade());
        }
        
    }


    // positive test
    @Test
    public void testGetGradeDRange() {
        simpleMethods = new SimpleMethods();
        for (int i = 60; i < 70; i++) {
            simpleMethods.setScore(i);
            assertEquals('D', simpleMethods.getGrade());
        }
        
    }

     // negative test
     @Test
     public void testGetGradeFailRange() {
         simpleMethods = new SimpleMethods();
         for (int i = 0; i <= 60; i++) {
             simpleMethods.setScore(i);
             assertEquals('F', simpleMethods.getGrade());
         }
         
     }

    // poor design test, it always pass because the condition is always true
    @Test
    public void testGetGradeDRangeNegative() {
        simpleMethods = new SimpleMethods();
        for (int i = 1; i < 101; i++) {
            simpleMethods.setScore(i);
            char g = simpleMethods.getGrade();// bad design
            assertEquals(g, simpleMethods.getGrade());
        }
        
    }

    // Test grade is a char type
    @Test
    public void testGetGradeType() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        // test if the char is a letter using the Character class and the isLetter() method
        assertTrue(Character.isLetter(simpleMethods.getGrade()));
    }

    // Test grade is an int type
    @Test
    public void testGetScoreType() {
        simpleMethods = new SimpleMethods();
        simpleMethods.setScore(95);
        // test if the int is a number using the Integer class and the isNumber() method
        assertTrue(Character.isDigit(simpleMethods.getScore()));
    }   

    
}
