package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestAddError {

    public static void main(String[] args) {
        // Create a TestResult object to hold the test results
        TestResult result = new TestResult();

        // Define a test case
        TestCase test = new TestCase("sampleTest") {
            @Override
            protected void runTest() throws Throwable {
                throw new RuntimeException("Unexpected error!"); // Simulate an error
            }
        };

        // Add an error to the TestResult
        result.addError(test, new RuntimeException("Unexpected error!"));

        // Print the number of errors
        System.out.println("Errors: " + result.errorCount()); // Output: Errors: 1
    }
}
