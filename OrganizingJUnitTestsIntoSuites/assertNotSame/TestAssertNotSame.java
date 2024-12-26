package OrganizingJUnitTestsIntoSuites.assertNotSame;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertNotSame {
    // Checks if two objects do not refer to the same instance

    @Test
    public void testAssertNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2);
         // Passes because obj1 and obj2 refer to different objects
        // assertNotSame() asserts that two objects are not the same
        // If the two objects are the same, the test fails
        // If the two objects are not the same, the test passes
    }

    @Test
    public void testIfObjectsAreNotSame() {
        Object obj1 = new Object();
        Car car1 = new Car();
        assertNotSame(obj1, car1); // Passes because obj1 and car1 do not refer to the same instance
    }

    @Test
    public void testIfCarObjectsAreSame1() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = car1;
        assertNotSame(car1, car2); // Fails because car1 and car2 refer to the same instance
     
        }

        @Test
    public void testIfCarObjectsAreSame2() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Toyota", "Camry");
        assertNotSame(car1, car2); // Passes because car1 and car2 refer to different instances
     
        }
}
