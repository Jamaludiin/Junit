package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestAddFailure {
    public static void main(String[] args) {
    TestResult result = new TestResult();

    TestCase test = new TestCase("sampleTest") {
    @Override
    protected void runTest() throws Throwable {
        assertEquals(1, 2); // This assertion fails
    }
};
result.addFailure(test, new AssertionFailedError("Assertion failed!"));
System.out.println("Failures: " + result.failureCount()); // Output: Failures: 1


}
}
