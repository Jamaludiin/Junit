package PracticeTwoJunit4;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
            TestMessageUtil.class, 
        TestJunit2.class, 
        TestJunit4.class);
          
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      // Print the total number of test cases run
      System.out.println("Number of test cases run: " + result.getRunCount());

      // Print if all tests were successful
      System.out.println("All tests successful: " + result.wasSuccessful());
   }
}  