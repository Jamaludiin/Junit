package OrganizingJUnitTestsIntoSuites.assertNotEquals;


import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestAssertNotEquals {
    
    @Test
    public void testNotEquals() {
        int result = 10 + 5;
        assertNotEquals(12, result); // Passes because 15 != 12
        // this method is used to check if two values are not equal
        // if the values are equal, the test fails
        // if the values are not equal, the test passes
        
    }
}
