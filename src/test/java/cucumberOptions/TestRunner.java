package cucumberOptions;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        //tags={"@Emailerror"},
        glue="stepdefinations",
        monochrome = true,
        plugin = {"pretty",
       "html:test-output" }
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}
