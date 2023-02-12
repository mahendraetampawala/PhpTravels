/**
 * 
 */
package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

/**
 * @author mahen
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"},

monochrome=true,
plugin = {"json:target/cucumber.json"})
//plugin= {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports","json:target/cucumber.json"})
public class Runner {

}
