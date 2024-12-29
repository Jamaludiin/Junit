package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestRunCount {
    
public static void main(String[] args) {
    TestResult result = new TestResult();
    TestCase test = new TestCase("sampleTest") {
        @Override
        protected void runTest() {
            System.out.println("Running test.");
        }
    };
    test.run(result);
    System.out.println("Number of tests run: " + result.runCount()); // Output: Number of tests run: 1

}
}
