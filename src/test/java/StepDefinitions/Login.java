/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.LoginElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class Login extends UserData{

	WebDriver driver=null;
	
	/*public Login(WebDriver driver) {
		this.driver=driver;
	}*/

	@Before
	public void browsersetup() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
	}
	@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}
	
	@Given("The user is on login page")
	public void The_user_is_on_login_page() {
		
		driver.navigate().to(link);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	@When("The user enters valid details")
	public void The_user_enters_valid_details(){
		//driver.findElement(By.id(inputEmailid)).sendKeys(email);
		LoginElements.inputEmailElementID(driver).sendKeys(email);
		//driver.findElement(By.id(inputPasswordid)).sendKeys(password);
		LoginElements.inputPasswordId(driver).sendKeys(password);
		
		
	}
	@And("The user clicks on captcha")
	public void The_user_clicks_on_captcha() throws InterruptedException {
		Thread.sleep(10000);
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		System.out.println("Captcha");
	}
	@And("The user clicks on login button")
	public void The_user_clicks_on_login_button() {
		
		//driver.findElement(By.id("login")).click();
		LoginElements.loginButton(driver).sendKeys(Keys.RETURN);
		
	}
	@Then("The user is navigated to dashboard")
	public void The_user_is_navigated_to_dashboard() throws InterruptedException {
		//driver.getPageSource().contains("Client Area");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, DashURL );
		Thread.sleep(2000);
		
	}
}
