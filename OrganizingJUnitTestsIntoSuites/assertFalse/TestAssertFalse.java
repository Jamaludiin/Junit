package OrganizingJUnitTestsIntoSuites.assertFalse;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertFalse {
    
    @Test
    public void testAssertFalse() {
        assertFalse(false);
        // this method returns true if the condition is false
        // this method returns false if the condition is true
        // test fails if the condition is true
        // test passes if the condition is false
    }

    @Test
    public void testFalseCondition() {
        int number = 10;
        assertFalse(number < 5); // Passes because the condition is false
    }


    @Test
    public void testFalseCondition2() {
        int number = 10;
        assertFalse(number > 5); // Fails because the condition is true
    }

    @Test
    public void testCarName() {
        Car car = new Car("Toyota", "Camry");
        assertFalse(car.getName().equals("Honda")); // passes because the condition is false thus the test passes as returns false
        // test fails if the condition is true
        // test passes if the condition is false
    }

    @Test
    public void testCarName2() {
        Car car = new Car("Toyota", "Camry");
        assertFalse(car.getName().equals("Toyota")); // fails because the condition is true thus the test fails as returns true
        // test fails if the condition is true
        // test passes if the condition is false
    }

    


}
