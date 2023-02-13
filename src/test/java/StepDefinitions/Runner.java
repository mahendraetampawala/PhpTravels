/**
 * 
 */
package StepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

/**
 * @author mahen
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"},
tags= ("@mustRun"),
monochrome=true,
plugin = {"json:target/cucumber.json"})
//plugin= {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports","json:target/cucumber.json"})
public class Runner {
	/*private static WebDriver driver=null;
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			main();

	}
		public static void main() {
			String projectpath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
			
			
			driver=new ChromeDriver();
			driver.navigate().to("https://phptravels.org/login");
			AccountDetails accountdetails=new AccountDetails(driver);
			Login login=new Login(driver);
			NewContact newcontact=new NewContact(driver);
			signup singup=new signup(driver);
			
		}*/
}
