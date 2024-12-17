import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

    // Test Default Constructor
    @Test
    public void testDefaultConstructor() {
        Car car = new Car();
        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(25000, car.getPrice(), 0.001);
    }

    // Test parameterized Constructor
    @Test
    public void testParameterizedConstructor() {
        Car car = new Car("Toyota", "Camry", 2022, 25000);
        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2022, car.getYear());
        assertEquals(25000, car.getPrice(), 0.001);
    }

  

    /*  Main method for debugging purposes
    public static void main(String[] args) {
        // Create a new Car instance for manual testing
        Car car = new Car("Toyota", "Camry", 2022, 25000);
        
        // Print details for debugging
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        
        // Manually validate the behavior
        if (!"Toyota".equals(car.getMake())) {
            System.out.println("Error: Make is incorrect!");
        }

        if (!"Camry".equals(car.getModel())) {
            System.out.println("Error: Model is incorrect!");
        }

        if (car.getYear() != 2022) {
            System.out.println("Error: Year is incorrect!");
        }

        if (car.getPrice() != 25000) {
            System.out.println("Error: Price is incorrect!");
        }

        System.out.println("Manual test completed.");
    }*/
}
