package OrganizingJUnitTestsIntoSuites.assertTimeout;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertTimeout {
    // Ensures a block of code completes within a specific time frame (useful for performance tests).


        @Test(timeout = 2000) // Timeout in milliseconds (2000ms = 2 seconds)
        public void testTimeout() throws InterruptedException {
            Thread.sleep(1000); // Completes within 2 seconds
        }


        @Test(timeout = 2000) // Timeout in milliseconds (2000 ms = 2 seconds)
        public void testTimeout1() throws InterruptedException {
            Thread.sleep(3000); // Completes within 3 seconds that is more than the timeout of 2 seconds
        } 
        
        
        @Test(timeout = 2500) // Timeout in milliseconds (2000 ms = 2 seconds)
        public void testTheDisplayMethodMustCompleteWithin2Seconds() throws InterruptedException {
            new Car("Toyota", "Camry").display3();
        }


        @Test(timeout = 2000) // Timeout in milliseconds (2000 ms = 2 seconds)
    public void testTheDisplayMethodMustCompleteWithin2Seconds1() throws InterruptedException {
        // Simulating a delay greater than 2 seconds
        Thread.sleep(2500); // Introduce a delay of 2.5 seconds (this will fail)
        new Car("Toyota", "Camry").display3(); // Should fail because of the sleep above
    }
}
