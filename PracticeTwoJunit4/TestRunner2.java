package PracticeTwoJunit4;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.Description;

public class TestRunner2 {
    public static void main(String[] args) {
        JUnitCore junitCore = new JUnitCore();

        // Add a custom listener to capture test names
        junitCore.addListener(new RunListener() {
            @Override
            public void testStarted(Description description) throws Exception {
                System.out.println("#Test started:# " + description.getMethodName());
            }
        });

        // Run the test classes
        Result result = junitCore.run(
            TestMessageUtil.class,
            TestJunit2.class,
            TestJunit4.class
        );

        // Print failures
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Print summary
        System.err.println("#Test completed\n");
        System.out.println("#Number of test cases run: " + result.getRunCount());
        System.out.println("#All tests successful: " + result.wasSuccessful());
    }
}
