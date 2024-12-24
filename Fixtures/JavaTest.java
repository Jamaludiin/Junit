package Fixtures;
import junit.framework.*;

// this is JUnit 3

public class JavaTest extends TestCase {
   protected int value1, value2;
   
   // assigning the values
   // setUp(): Prepares the environment before each test.
   // setUp() is called before each test
   protected void setUp(){
      value1 = 3;
      value2 = 3;
   }

   // test method to add two values
   // tearDown(): Cleans up the environment after each test.
   // testAdd(): Tests the add method.
   public void testAdd(){
      double result = value1 + value2;
      assertTrue(result == 6);
   }
}

/*What is a Fixture? 
    A fixture refers to a fixed state of a set of objects, data, 
    or environment used as a baseline for running tests. 
    The main purpose of fixtures is to ensure that the testing environment 
    is well-defined and consistent, so test results are reliable and repeatable.

    In simpler terms, it ensures that every test starts with the same setup and 
    ends with the same cleanup.


Why Use Fixtures?
    Ensures every test starts with a clean slate.
    Reduces redundancy by reusing setup/teardown logic across multiple tests.
    Makes tests easier to maintain and more reliable.
 */




 /*

The TestCase class is inherited in the code because it is part of JUnit 3, 
an earlier version of the JUnit testing framework. Let's break this down:

Why Inherit from TestCase?
    JUnit 3 Architecture: 
        In JUnit 3, the testing framework uses inheritance to set up a test class. 
       
        By extending the TestCase class:
            Your class becomes a test class that JUnit recognizes and runs.
            You gain access to utility methods like assertTrue(), assertEquals(), and more, 
            which are inherited from the TestCase class.
        
    Automatic Test Discovery:
        In JUnit 3, all test methods must start with the word test (e.g., testAdd()).
        The framework discovers these test methods during runtime because they belong to a class that inherits from TestCase.
                
    Access to Lifecycle Methods:
        The setUp() method in JUnit 3 is part of the test lifecycle. It runs before each test method to prepare any required resources or initial states.
        Similarly, there’s a tearDown() method (not shown in your code) that runs after each test method to clean up resources.

*/


/* 
Modern JUnit (JUnit 4 and JUnit 5)
JUnit has since moved away from the inheritance-based structure used in JUnit 3. Here's how modern JUnit versions differ:

    Annotations Instead of Inheritance:

        In JUnit 4 and 5, you no longer need to extend TestCase.
        Instead, you use annotations like @Test to mark test methods.
        Example (JUnit 4 or 5):
 */