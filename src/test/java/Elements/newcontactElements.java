/**
 * 
 */
package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author mahen
 *
 */
public class newcontactElements {

	private static WebElement element=null;
	
	static By newcontactBTN=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[1]/div[2]/div[1]/div[3]/a");
	static By firstName=By.id("inputFirstName");
	static By address=By.id("inputAddress1");
	static By lastName=By.id("inputLastName");
	static By Secondaddress=By.id("inputAddress2");
	static By companyName=By.id("inputCompanyName");
	static By city=By.id("inputCity");
	static By email=By.id("inputEmail");
	static By state=By.id("stateinput");
	static By contactnum=By.id("inputPhone");
	static By postalcode=By.id("inputPostcode");
	static By taxID=By.id("inputTaxId");
	static By country=By.id("country");
	static By generateEmailSelector=By.id("generalemails");
	static By invoiceemails=By.id("invoiceemails");
	static By supportemails=By.id("supportemails");
	static By productemails=By.id("productemails");
	static By domainemails=By.id("domainemails");
	static By saveBTN=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/div[4]/input[1]");
	static By cancelBtn=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/div[4]/input[2]");
	static By deleteBTN=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/div[4]/input[2]");
	static By newContactDropdown=By.id("inputContactId");

	public static WebElement newContactBTn(WebDriver driver) {
		element=driver.findElement(newcontactBTN);
		return element;
	}
	public static WebElement firstNameField(WebDriver driver) {
		element=driver.findElement(firstName);
		return element;
	}
	public static WebElement addressField(WebDriver driver) {
		element=driver.findElement(address);
		return element;
	}
	public static WebElement lastNameField(WebDriver driver) {
		element=driver.findElement(lastName);
		return element;
	}
	public static WebElement secondAddress(WebDriver driver) {
		element=driver.findElement(Secondaddress);
		return element;
	}
	public static WebElement companyNameField(WebDriver driver) {
		element=driver.findElement(companyName);
		return element;
	}
	public static WebElement City(WebDriver driver) {
		element=driver.findElement(city);
		return element;
	}
	public static WebElement emailField(WebDriver driver) {
		element=driver.findElement(email);
		return element;
	}
	public static WebElement stateField(WebDriver driver) {
		element =driver.findElement(state);
		return element;
	}
	public static WebElement contatctNumber(WebDriver driver) {
		element=driver.findElement(contactnum);
		return element;
	}
	public static WebElement postalCode(WebDriver driver) {
		element=driver.findElement(postalcode);
		return element;
	}
	public static WebElement taxID(WebDriver driver) {
		element=driver.findElement(taxID);
		return element;
	}
	public static WebElement country(WebDriver driver) {
		element=driver.findElement(country);
		return element;
	}
	public static WebElement generalemails(WebDriver driver) {
		element=driver.findElement(generateEmailSelector);
		return element;
	}
	public static WebElement invoiceemails(WebDriver driver) {
		element=driver.findElement(invoiceemails);
		return element;
	}
	public static WebElement supportemails(WebDriver driver) {
		element=driver.findElement(supportemails);
		return element;
	}
	public static WebElement productemails(WebDriver driver) {
		element=driver.findElement(productemails);
		return element;
	}
	public static WebElement domainemails(WebDriver driver) {
		element=driver.findElement(domainemails);
		return element;
	}
	public static WebElement savebutton(WebDriver driver) {
		element=driver.findElement(saveBTN);
		return element;
	}
	public static WebElement cancelButton(WebDriver driver) {
		element=driver.findElement(cancelBtn);
		return element;
	}
	public static WebElement deleteButton(WebDriver driver) {
		element=driver.findElement(deleteBTN);
		return element;
	}
	public static WebElement newcontactDropDown(WebDriver driver) {
		element=driver.findElement(newContactDropdown);
		return element;
	}
}
