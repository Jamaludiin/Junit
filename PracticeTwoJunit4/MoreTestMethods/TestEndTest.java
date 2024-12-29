package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestEndTest {
    
    public static void main(String[] args) {
    TestResult result = new TestResult();

    TestCase test = new TestCase("sampleTest") {
    @Override
    protected void runTest() {
        System.out.println("Test executed.");
    }
    };

    result.startTest(test);
    test.run(result);
    result.endTest(test);
    System.out.println("Test completed."); // Output: Test completed.

}
}
