package OrganizingJUnitTestsIntoSuites.assertNull;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AssertNullExample {

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
}
