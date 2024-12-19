package OrganizingJUnitTestsIntoSuites;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCase3 {
    @Test
    public void testMultiplication() {
        assertEquals(15, 3 * 5);
    }
}
