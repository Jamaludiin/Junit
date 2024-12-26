package OrganizingJUnitTestsIntoSuites.assertSame;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertSame {
        // Checks if two objects refer to the same instance.

    
    @Test
    public void testAssertSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2);
        // Passes because obj1 and obj2 refer to the same object
        // assertSame(obj1, obj2); // Passes because obj1 and obj2 refer to the same object
        // this method fails if the objects are not the same
        // this method passes if the objects are the same
        // is used to check if two objects refer to the same object
    }

    @Test
    public void testSame() {
        String str = "JUnit";
        String sameStr = str;
        assertSame(str, sameStr); // Passes because both refer to the same instance
    }

    @Test
    public void testIfCarObjectsAreSame() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        assertSame(car1, car2); // Fails because car1 and car2 refer to different instances
    }

    @Test
    public void testIfCarObjectsAreSame1() {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = car1;
        assertSame(car1, car2); // Passes because car1 and car2 refer to the same instance
    }
       
}
