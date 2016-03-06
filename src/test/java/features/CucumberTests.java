package features;

import be.dewolf.customer.SpringContextTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by yannis on 5/03/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/")
public class CucumberTests extends SpringContextTests {
}
