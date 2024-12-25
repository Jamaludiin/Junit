package OrganizingJUnitTestsIntoSuites.assertNotEquals;


import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertNotEquals {
    
    Car car = new Car();

    @Test
    public void testNotEquals() {
        int result = 10 + 5;
        assertNotEquals(12, result); // Passes because 15 != 12
        // this method is used to check if two values are not equal
        // if the values are equal, the test fails
        // if the values are not equal, the test passes

    }

    @Test
    public void testNotEquals2() {
        car.setModel("Camry"); 
        car.setName("Toyota");
        
        assertNotEquals(car.getModel(), car.getName()); // Passes because 15 != 12
        // this method is used to check if two values are not equal
        // if the values are equal, the test fails
        // if the values are not equal, the test passes

    }
}
