package OrganizingJUnitTestsIntoSuites.assertNotNull;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertNotNull {
    
    Car car;
    
    @Test
    public void testNotNull() {
        String str = "Hello";
        assertNotNull(str); // Passes because str is not null
        // this method fails if the name is null
        // this method passes if the name is not null
        // is used to check if a value is not null
    }

    @Test
    public void testNotNull2() {
        car = new Car();
        assertNotNull(car); // Passes because car is not null
        // this method fails if the name is null
        // this method passes if the name is not null
        // is used to check if a value is not null

        /*The car variable now refers to a new Car object, which is not null.
        assertNotNull(car);: This assertion checks that the car object is not null. 
        Since the car object is an instance of the Car class (created with new Car()), 
        it is not null, and the assertion will pass. */
    }


    @Test
    public void testgetModelNotNull() {
        car = new Car();
        assertNotNull(car.getModel()); // fails because getModel Method is null, means cannot get the model value
       }

       @Test
       public void testgetNameNotNull() {
        car = new Car();
        car.setName("Toyota");
        assertNotNull(car.getName()); // passes because getName Method is not null, means can get the name value from the object
       }


    


}
