

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(3, 5);
        // 3 + 5 = 8, what is the third parameter?
        // 3.0 + 5.0 = 8.0 with a precision of 0.001
        assertEquals(2, calculator.add(), 0.001);
        
        calculator = new Calculator(0, 0);
        // 0 + 0 = 0 with a precision of 0.001
        assertEquals(0, calculator.add(), 0.001);
        
        calculator = new Calculator(-1, 1);
        // -1 + 1 = 0 with a precision of 0.001
        assertEquals(0, calculator.add(), 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator(5, 3);
        // 5 - 3 = 2 with a precision of 0.001
        assertEquals(2, calculator.subtract(), 0.001);
        
        calculator = new Calculator(0, 0);
        // 0 - 0 = 0 with a precision of 0.001
        assertEquals(0, calculator.subtract(), 0.001);
        
        calculator = new Calculator(-1, 0);
        // -1 - 0 = -1 with a precision of 0.001 
        assertEquals(-1, calculator.subtract(), 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator(2, 3);
        // 2 * 3 = 6 with a precision of 0.001
        assertEquals(6, calculator.multiply(), 0.001);
        
        calculator = new Calculator(0, 5);
        // 0 * 5 = 0 with a precision of 0.001
        assertEquals(0, calculator.multiply(), 0.001);
        
        calculator = new Calculator(-2, 2);
        // -2 * 2 = -4 with a precision of 0.001
        assertEquals(-4, calculator.multiply(), 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator(6, 3);
        // 6 / 3 = 2 with a precision of 0.001
        assertEquals(2, calculator.divide(), 0.001);
        
        calculator = new Calculator(0, 5);
        // 0 / 5 = 0 with a precision of 0.001
        assertEquals(0, calculator.divide(), 0.001);
        
        // Handle division by zero
        calculator = new Calculator(1, 0);
        try {
            calculator.divide();
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }
}