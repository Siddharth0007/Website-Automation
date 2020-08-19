package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.Test;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="stepdefinations",
        monochrome = true,
        plugin = {"pretty",
       "html:test-output" }
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}
