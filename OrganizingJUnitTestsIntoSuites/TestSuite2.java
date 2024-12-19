package OrganizingJUnitTestsIntoSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSuite1.class, // Including another suite
    TestCase3.class   // Including a test case
})
public class TestSuite2 {
    // This class is also a holder for annotations
}
