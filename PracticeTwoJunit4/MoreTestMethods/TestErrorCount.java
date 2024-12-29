package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestResult;

public class TestErrorCount {
    
    public static void main(String[] args) {

    TestResult result = new TestResult();
    
    System.out.println("Error count: " + result.errorCount()); // Output: Error count: 0


}

}