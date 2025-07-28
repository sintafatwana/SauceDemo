package tests.stepdefs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"java.tests.stepdefs"},
        features = {"src/test/resources"},
        plugin = {"pretty","html:reports/test-report.html"}
)

public class CucumberTest {
}
