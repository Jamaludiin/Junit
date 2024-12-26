package PracticeTwoJunit4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit4 {
   protected double fValue1;
   protected double fValue2;

   @Before 
   public void setUp() {
      fValue1 = 2.0;
      fValue2 = 3.0;
   }

   @Test
   public void testAdd() {
      // Print the number of test cases (using a custom counter in a suite)
      System.out.println("Test Case Name = " + this.getClass().getSimpleName() + ".testAdd");
   }

   @Test
   public void testSubtract() {
      double result = fValue2 - fValue1;
      assertEquals(1.0, result, 0.0);
   }
}
