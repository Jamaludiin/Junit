package OrganizingJUnitTestsIntoSuites.assertTrue;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAssertTrue {
    
    @Test
    public void testPassByValue() {
        // example of pass by value
        int a = 5;
        int b = 5;
        assertTrue(a == b);
    }

    @Test
    public void testPassByReference() {
        // example of pass by reference
        Car car1 = new Car();

        car1.setName("Toyota");
        car1.setModel("Camry");

        /// check if name and model are not null
        assertTrue(car1.getName() != null);
        assertTrue(car1.getModel() != null);

        /// check if name and model are equal
        assertTrue(car1.getName().equals("Toyota"));
        assertTrue(car1.getModel().equals("Camry"));

        // this method returns true if both arguments are not null and are equal
        // test pass if both arguments are not null and are equal
        // if he returns false, the test fails
    }

    // test the display method
    @Test
    public void testDisplay() {
        Car car = new Car();
        car.setName("Toyota");
        car.setModel("Camry");
        car.display();
    }
}

