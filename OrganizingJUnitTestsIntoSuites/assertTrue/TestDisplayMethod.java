package OrganizingJUnitTestsIntoSuites.assertTrue;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestDisplayMethod {

     // test the display method
    @Test
    public void testDisplay() {
        Car car = new Car();
        car.setName("Toyota");
        car.setModel("Camry");
        car.display();
    }
    
}


/*
To write a test case for the display() method in the Car class, 
we need to verify its output. Since display() only prints the car's details 
to the console, testing it directly requires capturing the System.out output.

Here's an example test case using JUnit's SystemOutRule from the 
org.junit.contrib.java.lang.system library:
 */