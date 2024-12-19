package OrganizingJUnitTestsIntoSuites;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCase1 {
    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }
}
