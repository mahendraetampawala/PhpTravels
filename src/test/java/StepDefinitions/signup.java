/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.signupElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class signup extends UserData{

	WebDriver driver=null;
	
	@Given("The user is on registration page")
	public void The_user_is_on_registration_page() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.navigate().to(link);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div[1]/div/form/div/div[2]/a")).click();
		signupElements.newaccount(driver).sendKeys(Keys.RETURN);
		
	}
	@When("The user inputs valid details")
	public void The_user_inputs_valid_details() {
		
		//driver.findElement(By.id("inputFirstName")).sendKeys(firstname);
		signupElements.firstName(driver).sendKeys(firstname);
		//driver.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys(lastname);
		signupElements.lastname(driver).sendKeys(lastname);
		//driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(newmail);
		signupElements.emailaddress(driver).sendKeys(newmail);
		//driver.findElement(By.xpath("//*[@id=\"inputPhone\"]")).sendKeys(phone);
		signupElements.phonenumberfield(driver).sendKeys(phone);
		
		//driver.findElement(By.id("inputCompanyName")).sendKeys(company);
		signupElements.companyNameField(driver).sendKeys(company);
		//driver.findElement(By.id("inputAddress1")).sendKeys(address);
		signupElements.companyAddress(driver).sendKeys(address);
		//driver.findElement(By.id("inputCity")).sendKeys(city);
		signupElements.CityField(driver).sendKeys(city);
		//driver.findElement(By.id("stateinput")).sendKeys(state);
		signupElements.StateField(driver).sendKeys(state);
		//driver.findElement(By.id("inputPostcode")).sendKeys(postalcode);
		signupElements.postalCode(driver).sendKeys(postalcode);
		//driver.findElement(By.id("inputCountry")).sendKeys(country);
		signupElements.country(driver).sendKeys(country);
		
		//driver.findElement(By.xpath("//*[@id=\"containerPassword\"]/div[4]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"modalGeneratePassword\"]/div/div/div[2]/div[4]/div/button[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"btnGeneratePasswordInsert\"]")).click();
		//driver.findElement(By.xpath("/html/body/form[2]/div/div/div/div[1]/button")).click();
		
		//driver.findElement(By.id("inputNewPassword1")).sendKeys(password);
		signupElements.passwordField(driver).sendKeys(password);
		//driver.findElement(By.id("inputNewPassword2")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		signupElements.confirmPWD(driver).sendKeys(password);
		
		
	}
	@And("The user selects captcha")
	public void The_user_selects_captcha() throws InterruptedException {
		System.out.println("manually handle the captcha");
		Thread.sleep(20000);
	}
	@And("User clicks on register button")
	public void User_clicks_on_register_button() {
		
		//driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input")).click();
		signupElements.registrationbtn(driver).sendKeys(Keys.RETURN);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}
	@Then("navigated to dashboard")
	public void navigated_to_dashboard() throws InterruptedException {
		driver.getPageSource().contains("Client Area");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
}
