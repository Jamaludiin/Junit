package OrganizingJUnitTestsIntoSuites.assertNull;

import static org.junit.Assert.assertNull;
import org.junit.Test;

import  OrganizingJUnitTestsIntoSuites.Car;

public class AssertNullExample {

    Car car = new Car();
    @Test
    public void testNull() {
        String str = null;
        assertNull(str); // Passes because str is null
        // this method fails if the name is not null
        // this method passes if the name is null
        // is used to check if a value is null
    }

    @Test
    public void testAssertNull2() {
        String name = "null";
        assertNull(name);// fails because name is not null
        // this method fails if the name is not null
        // this method passes if the name is null
        // is used to check if a value is null
        
    }

    @Test
    public void testAssertNull3() {
        car.setName("null");
        car.setModel("null");

        assertNull(car.getName());// fails because name is not null it has a value which is not null as string
        assertNull(car.getModel());// fails because name is not null it has a value which is not null as string
        // this method fails if the name is not null
        // this method passes if the name is null
        // is used to check if a value is null
        
    }

    @Test
    public void testAssertNull4() {
        car.setName(null); // Set name to null
        car.setModel(null); // Set model to null

        assertNull(car.getName());  // This will pass because name is null
        assertNull(car.getModel()); // This will pass because model is null
    }

    


}
