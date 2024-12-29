package PracticeTwoJunit4.MoreTestMethods;

import java.util.Enumeration;

import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;

public class TestEnumeration {
    
    public static void main(String[] args) {

    TestResult result = new TestResult();
    TestCase test = new TestCase("sampleTest") {
        @Override
        protected void runTest() {
            throw new RuntimeException("Unexpected error!");
        }
    };
    result.addError(test, new RuntimeException("Unexpected error!"));

    Enumeration<TestFailure> errors = result.errors();
    while (errors.hasMoreElements()) {
        System.out.println(errors.nextElement().thrownException().getMessage());
    }
    // Output: Unexpected error!


}

}
