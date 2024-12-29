package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestStop {

    public static void main(String[] args) {
        // Create a TestResult object to track test execution
        TestResult result = new TestResult();

        // Create the first test case
        TestCase test1 = new TestCase("test1") {
            @Override
            protected void runTest() {
                System.out.println("Running test 1.");
            }
        };

        // Create the second test case
        TestCase test2 = new TestCase("test2") {
            @Override
            protected void runTest() {
                System.out.println("Running test 2.");
            }
        };

        // Run the first test case
        test1.run(result);

        // Stop the TestResult (indicates stopping test execution)
        result.stop();

        // Check if TestResult has been stopped before running the next test
        if (!result.shouldStop()) {
            test2.run(result);
        }

        // Print the number of tests executed
        System.out.println("Number of tests run: " + result.runCount());
    }
}
