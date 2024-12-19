package OrganizingJUnitTestsIntoSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Run all the test cases in this test suite
 */
/**
 * This test suite contains test cases for testing the functionality of the application.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestCase1.class,
    TestCase2.class
})
public class TestSuite1 {
    // This class remains empty; it's used only as a holder for the above annotations
}
