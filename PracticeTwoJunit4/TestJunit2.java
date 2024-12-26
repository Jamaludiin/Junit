package PracticeTwoJunit4;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2 extends TestCase  {
   protected double fValue1;
   protected double fValue2;
   
   @Before 
   public void setUp() {
      fValue1 = 2.0;
      fValue2 = 3.0;
   }
	
   @Test
   public void testAdd() {
      //count the number of test cases
      System.out.println("No of Test Case = "+ this.countTestCases());
		
      //test getName 
      String name = this.getName();
      System.out.println("Test Case Name = "+ name);

      //test setName
      this.setName("testNewAdd");
      String newName = this.getName();
      System.out.println("Updated Test Case Name = "+ newName);
   }
	
   @Test
   public void testSubtract() {
      double result = fValue2 - fValue1;
      assertEquals(1.0, result);
   }


   //tearDown used to close the connection or clean up activities
   public void tearDown(  ) {
    System.out.println("Test Completed\n");
    System.out.println("No of Test Case = "+ this.countTestCases());

   }
}

/*
 *The reason why the number of test cases is always 1 when you run your code 
 is because of how JUnit 3 (and TestCase class) works in terms of counting 
 test cases.

Explanation:
You are extending TestCase from JUnit 3, which is designed for running tests 
individually, and it does not have the same built-in mechanism for running multiple tests together like JUnit 4 does. In JUnit 3, each test method is considered a single test case, but the framework doesn't automatically count multiple tests unless they are explicitly executed in a test suite.

countTestCases() is a method inherited from TestCase, but it's used to count 
the number of test methods in the current test (the method currently being executed), 
not the entire class. So, for each test method, countTestCases() will return 1.

Why countTestCases() Outputs 1:
In your testAdd() method, you call this.countTestCases(), which counts 
the number of tests in the current test method. Since testAdd() 
is just one method, countTestCases() returns 1.
Similarly, in tearDown(), countTestCases() will also return 1 because that method is being executed after the completion of each individual test.

How to Fix It:
To count the total number of test cases (test methods) in the entire class, 
you should either:

Use JUnit 4 with JUnitCore for running tests or
Manually track the test cases or run tests using a test suite in JUnit 3.
Solution 1: Switch to JUnit 4 (Recommended)
You can switch to JUnit 4 to take advantage of the @Test annotations, 
which is more flexible and allows you to run and count multiple test cases 
more effectively.

Here is an updated version of your test using JUnit 4: see the other file called TestJunit4
 */