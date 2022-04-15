package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, AnnotationTest.class, TestCase.class, TestCaseDiv.class, TestCaseMul.class,
		TestCaseSub.class })

public class AllTests {

}
