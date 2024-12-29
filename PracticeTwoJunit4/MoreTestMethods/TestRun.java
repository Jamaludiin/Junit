package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestRun {

    public static void main(String[] args) {
        // Create a test case
        TestCase test = new TestCase("sampleTest") {
            @Override
            protected void runTest() {
                System.out.println("Test is running!");
            }
        };

        // Create a TestResult to collect the results
        TestResult result = new TestResult();

        // Run the test and collect the results
        test.run(result);

        // Print the test results
        System.out.println("Number of tests run: " + result.runCount());
    }
}
