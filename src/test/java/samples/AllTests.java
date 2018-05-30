package samples;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite that runs all the sample tests
 *
 */
public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("All JUnit Tests");
        suite.addTest(VectorTest.suite());
        suite.addTest(new TestSuite(samples.money.MoneyTest.class));
        suite.addTest(AllTests.suite());
        return suite;
    }
}