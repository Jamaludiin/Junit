package Fixtures;
import junit.framework.*;

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