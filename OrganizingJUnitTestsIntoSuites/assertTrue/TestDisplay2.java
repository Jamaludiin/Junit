package OrganizingJUnitTestsIntoSuites.assertTrue;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestDisplay2 {

    @Test
    public void testDisplay2() {
        // Arrange
        Car car = new Car("Toyota", "Corolla");

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            // Act
            car.display2();

            // Assert
            String expectedOutput = "Name: Toyota\nModel: Corolla\n";
            assertEquals(expectedOutput, outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }
    }
}
