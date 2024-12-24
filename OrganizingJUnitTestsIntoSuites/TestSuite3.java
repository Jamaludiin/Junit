package OrganizingJUnitTestsIntoSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestCase1.class,
    TestCase2.class,
    TestCase3.class
})

public class TestSuite3 {

    // this test will fail as it is not part of the suite 
    // This test has an issue because the TestSuite3 class is both 
    // a test suite (using @RunWith(Suite.class) and @Suite.SuiteClasses) 
    // and contains a test method (testAddition2()), which is not allowed.
    @Test
    public void testAddition2() {
        assertEquals(7, 2 + 5);
    }
    
}
