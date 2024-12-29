package PracticeTwoJunit4.MoreTestMethods;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestStartTest {
    
public static void main(String[] args) {
    TestResult result = new TestResult();
    TestCase test = new TestCase("sampleTest") {
        @Override
        protected void runTest() {
            System.out.println("Test started!");
        }
    };
    result.startTest(test);
    test.run(result);
    // Output: Test started!

}

}
