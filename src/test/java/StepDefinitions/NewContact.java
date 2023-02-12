/**
 * 
 */
package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import Elements.LoginElements;
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
	public void The_user_is_on_dashboard() throws InterruptedException {
		
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to(link);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		LoginElements.inputEmailElementID(driver).sendKeys(email);
		LoginElements.inputPasswordId(driver).sendKeys(password);
		Thread.sleep(20000);
		System.out.println("Captcha");
		
		LoginElements.loginButton(driver).sendKeys(Keys.RETURN);
		
	}
	@And("User clicks on the new contact button")
	public void User_clicks_on_the_new_contact_button() {
		newcontactElements.newContactBTn(driver).sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@When("user clicks on choose contact dropdown field and selects the new contact")
	public void user_clicks_on_choose_contact_dropdown_field_and_selects_the_new_contact() {
		

		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return newcontactElements.newcontactDropDown(driver);
				
			}
		});
		*/
		newcontactElements.newcontactDropDown(driver).sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		
		Select newcontact=new Select(newcontactElements.newcontactDropDown(driver));
		newcontact.selectByValue("new");
		
	}
	@And("User adds valid inputs")
	public void User_adds_valid_inputs() {
		newcontactElements.firstNameField(driver).sendKeys(firstname);
		newcontactElements.lastNameField(driver).sendKeys(lastname);
		newcontactElements.addressField(driver).sendKeys(address);
		newcontactElements.companyNameField(driver).sendKeys(company);
		newcontactElements.stateField(driver).sendKeys(state);
		newcontactElements.emailField(driver).sendKeys(newcontactmail);
		newcontactElements.City(driver).sendKeys(city);
		newcontactElements.contatctNumber(driver).sendKeys(phone);
		newcontactElements.country(driver).sendKeys(country);
		
	
		
	}
	@And("User selects checkboxes as needed")
	public void User_selects_checkboxes_as_needed() {
		
		WebElement check1=newcontactElements.generalemails(driver);
		check1.click();
		WebElement check2=newcontactElements.invoiceemails(driver);
		check2.click();
		WebElement check3=newcontactElements.supportemails(driver);
		check3.click();
		WebElement check4=newcontactElements.productemails(driver);
		check4.click();
		WebElement check5=newcontactElements.domainemails(driver);
		check5.click();
		
		
		
	}
	@Then("The user clicks on the save changes button")
	public void The_user_clicks_on_the_save_changes_button() throws InterruptedException {
		
		//WebElement clickSBTN=newcontactElements.savebutton(driver);
		//JavascriptExecutor clickSBTN1=(JavascriptExecutor)driver;
		//clickSBTN1.executeScript("arguments[0].click();", clickSBTN);
		//WebElement clickSBTN=newcontactElements.savebutton(driver);
		//clickSBTN.click();
		
		
		/*By xpath = By.xpath("//button[@name='save'][@type='submit'][contains(text(),'Save Changes')]");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		  .until(ExpectedConditions.presenceOfElementLocated(xpath));

		myDynamicElement.click();
		*/
		
		newcontactElements.savebutton(driver).sendKeys(Keys.RETURN);
		driver.getPageSource().contains("Contact created successfully!");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	@Given("The user is on client area")
	public void The_user_is_on_client_area() throws InterruptedException {
	
		driver.navigate().to(clientDashBoard);
		
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
	
	
}
