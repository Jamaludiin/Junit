package OrganizingJUnitTestsIntoSuites.assertTrue;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import OrganizingJUnitTestsIntoSuites.Car;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarTest {

    @Test
    public void testDisplay() {
        // Arrange
        Car car = new Car("Toyota", "Corolla");

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Act
            car.display();

            // Assert
            assertEquals("Car: Toyota Corolla\n", outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }
}
