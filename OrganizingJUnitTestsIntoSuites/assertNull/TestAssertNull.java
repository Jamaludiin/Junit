package OrganizingJUnitTestsIntoSuites.assertNull;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestAssertNull {
    
    @Test
    public void testassertNull() {
        String name = null;
        assertNull(name);
        // this method fails if the name is not null
        // this method passes if the name is null
        // is used to check if a value is null
        
    }

    @Test
    public void testNull2() {
        String str = null;
        assertNull(str); // Passes because str is null
    }

}
