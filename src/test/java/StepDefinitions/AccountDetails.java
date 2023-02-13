/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Elements.AccountDetailsElements;
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

	WebDriver driver=null;
	//UserData data=new UserData();
	//Login login=new Login();
	
	/*public AccountDetails(WebDriver driver) {
		this.driver=driver;
	}*/
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
		AccountDetailsElements.updateButton(driver).sendKeys(Keys.RETURN);
		
		
	}
	@When("User clicks on relevent fields and change details")
	public void User_clicks_on_relevent_fields_and_change_details() {
		AccountDetailsElements.firstname(driver).clear();
		AccountDetailsElements.firstname(driver).sendKeys(Updatedfirstname);
		
		AccountDetailsElements.lastName(driver).clear();
		AccountDetailsElements.lastName(driver).sendKeys(Updatedlastname);
		
		AccountDetailsElements.companyName(driver).clear();
		AccountDetailsElements.companyName(driver).sendKeys(Updatedcompany);
		
		AccountDetailsElements.Email(driver).clear();
		AccountDetailsElements.Email(driver).sendKeys(Updatednewcontactmail);
		
		Select payment=new Select(AccountDetailsElements.payment(driver));
		payment.selectByVisibleText(paymentMethod);
		
		Select Billing=new Select(AccountDetailsElements.BillingAdd(driver));
		Billing.selectByValue("1248");
		
		//AccountDetailsElements.mobileNUmber2(driver).sendKeys(null);
		
		AccountDetailsElements.Address2Field(driver).clear();
		AccountDetailsElements.Address2Field(driver).sendKeys(Updatedaddress);
		
		AccountDetailsElements.address2(driver).clear();
		AccountDetailsElements.address2(driver).sendKeys(Updatedaddress);
		
		AccountDetailsElements.cityField(driver).clear();
		AccountDetailsElements.cityField(driver).sendKeys(Updatedcity);
		
		AccountDetailsElements.State(driver).clear();
		AccountDetailsElements.State(driver).sendKeys(Updatedstate);
		
		AccountDetailsElements.ZipCode(driver).clear();
		AccountDetailsElements.ZipCode(driver).sendKeys(Updatedpostalcode);
		
	
		
		AccountDetailsElements.phoneNumber(driver).clear();
		AccountDetailsElements.phoneNumber(driver).sendKeys(Updatedphone);
		
		
	}
	@And("user clicks on checkboxes as needed")
	public void user_clicks_on_checkboxes_as_needed() {
		
		WebElement checkbox1=AccountDetailsElements.GenerateEmailCheckBox(driver);
		checkbox1.click();
		WebElement checkbox2=AccountDetailsElements.InvoiceCheckBox(driver);
		checkbox2.click();
		WebElement checkbox3=AccountDetailsElements.supportCheckBox(driver);
		checkbox3.click();
		
		
	}
	@Then("User clicks on save changes button")
	public void User_clicks_on_save_changes_button() {
		
	}
	
	
}
