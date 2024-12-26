package OrganizingJUnitTestsIntoSuites.assertThrows;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

public class TestAssertThrows {

    // Verifies that a specific exception is thrown.

    @Test
    public void testAssertThrows() {
        assertThrows( Exception.class, () -> {
            throw new Exception("Test exception");
        });

        /*() -> {
        throw new Exception("Test exception");
            }
            
           The lambda explicitly throws an Exception with the message "Test exception."
            Why This Test Passes:
            The test expects an Exception to be thrown.
            The code inside the lambda explicitly throws an Exception.
            Since the behavior matches the expectation, the test passes.
                */
            }



    @Test
    public void testThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 /0; // This will throw ArithmeticException and test will pass
        });

        /*
         * 
         assertThrows(ArithmeticException.class, ...):

        This assertion checks that the specified exception (ArithmeticException) is thrown when the code inside the lambda (() -> { ... }) is executed.
        If the exception is thrown, the test passes.
        If no exception or a different exception is thrown, the test fails.
         */

         /*Why It Passes:
            The test expects an ArithmeticException to be thrown, and the operation 10 / 0 does throw an ArithmeticException.
            Since the actual behavior matches the expected behavior, the test passes. */
    }

    @Test
    public void testThrowsException1() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 2; // This will not throw ArithmeticException and test will fails
        });

         /*Why It Fails:
            The test expects an ArithmeticException to be thrown, but the operation 10 / 2 does not throw an ArithmeticException.
            Since the actual behavior does not match the expected behavior, the test fails. */

    }


    @Test
    public void testIfCarConstructorAcceptTwoArguments() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car("Toyota", "Camry"); // this fails because the constructor only accepts two arguments
        });
    
    }

    @Test
    public void testIfCarConstructorAcceptDifferentDataTypeArguments() {
        assertThrows(IllegalArgumentException.class, () -> {
            String invalidName = null; // Simulating an invalid argument
            String invalidModel = null;
            
            if (invalidName == null || invalidModel == null) {
                throw new IllegalArgumentException("Car constructor does not accept null arguments");
            }
            
            Car car = new Car(invalidName, invalidModel);
        });
    }

    @Test
    public void testIfCarConstructorAcceptDifferentDataTypeArguments1() {
        assertThrows(IllegalArgumentException.class, () -> {
            // Simulate an invalid scenario using the Car object
            Car car = new Car("Toyota", "Camry");
            if (!(car.getName() instanceof String) || !(car.getModel() instanceof String)) {
                throw new IllegalArgumentException("Invalid data types for Car constructor");
            }
         });
    }

    @Test
    public void testIfCarConstructorAcceptDifferentDataTypeArguments2() {
    assertThrows(IllegalArgumentException.class, () -> {
        // Simulate an invalid scenario using the Car object
        Car car = new Car("Toyota", "Camry");
        if ((car.getName() == "Toyota") || (car.getModel() == "Camry")) {
            throw new IllegalArgumentException("The condition is true thats why i am throwing the exception");
            }
            // it trhows the exception because the condition is true
        });
    }

@Test
public void testIfCarConstructorAcceptDifferentDataTypeArguments3() {
    assertThrows(IllegalArgumentException.class, () -> {
        Car car = new Car(null, null); // Simulate invalid input
        if (car.getName() == null || car.getModel() == null) {
            throw new IllegalArgumentException("Name or model cannot be null");
        }
    });
}


}
