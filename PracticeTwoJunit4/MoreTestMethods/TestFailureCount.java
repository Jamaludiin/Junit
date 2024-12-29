package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestFailureCount {
    
public static void main(String[] args) {
    TestResult result = new TestResult();

    System.out.println("Failure count: " + result.failureCount()); // Output: Failure count: 0


}


}