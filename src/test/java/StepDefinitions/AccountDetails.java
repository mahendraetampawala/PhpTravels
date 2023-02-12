/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.LoginElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class AccountDetails extends UserData {
/*
	WebDriver driver=null;
	//UserData data=new UserData();
	//Login login=new Login();
	
	public AccountDetails(WebDriver driver) {
		this.driver=driver;
	}
	@Given("The user is on client area")
	public void The_user_is_on_client_area() throws InterruptedException {
	
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to(link);
		
		//data.userData();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	
		
		LoginElements.inputEmailElementID(driver).sendKeys(email);
		LoginElements.inputPasswordId(driver).sendKeys(password);
		Thread.sleep(20000);
		System.out.println("Captcha");
		
		LoginElements.loginButton(driver).sendKeys(Keys.RETURN);
		
		
	}
	@And("Clicks on account details button")
	public void Clicks_on_account_details_button() {
		
	}
	@When("User clicks on relevent fields and change details")
	public void User_clicks_on_relevent_fields_and_change_details() {
		
	}
	@Then("User clicks on save changes button")
	public void User_clicks_on_save_changes_button() {
		
	}
	
	*/
}
