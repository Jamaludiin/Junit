package OrganizingJUnitTestsIntoSuites.MasterTestSuite;

import OrganizingJUnitTestsIntoSuites.TestSuite1;
import OrganizingJUnitTestsIntoSuites.TestSuite2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestSuite1.class,
    TestSuite2.class
})
public class MasterTestSuite {
    // Empty class, used as a container for the suite
}

