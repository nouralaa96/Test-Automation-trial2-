package ruuner;

import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;
import test.BaseTest;


@CucumberOptions(features="src/test/java/feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report"})

public class TestRunner extends BaseTest
{

}
