/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.newcontactElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class NewContact extends UserData {

	WebDriver driver=null;
	
	@Given("The user is on dashboard")
	public void The_user_is_on_dashboard() {
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to(link);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}
	@And("User clicks on the new contact button")
	public void User_clicks_on_the_new_contact_button() {
		newcontactElements.newContactBTn(driver).sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@When("User adds valid inputs")
	public void User_adds_valid_inputs() {
		
	}
	@And("User selects all the check boxes")
	public void User_selects_all_the_check_boxes() {
		
	}
	@Then("User clicks the save button")
	public void User_clicks_the_save_button() {
		
	}
}
