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
public class signupElements {
	private static WebElement element=null;
	
	static By newAccountLink=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div/form/div/div[2]/a");
	static By firstNamefield=By.id("inputFirstName");
	static By lastNameField=By.xpath("//*[@id=\"inputLastName\"]");
	static By EmailField=By.xpath("//*[@id=\"inputEmail\"]");
	static By phoneNumberfield=By.xpath("//*[@id=\"inputPhone\"]");
	static By companynameField=By.id("inputCompanyName");
	static By companyAddressField=By.id("inputAddress1");
	static By cityField=By.id("inputCity");
	static By stateField=By.id("stateinput");
	static By postalCode=By.id("inputPostcode");
	static By countryField=By.id("inputCountry");
	static By passwordField=By.id("inputNewPassword1");
	static By confirmPwd=By.id("inputNewPassword2");
	static By registerBTN=By.xpath("//*[@id=\"frmCheckout\"]/p/input");
	static By generatePWDBTN=By.xpath("//*[@id=\"containerPassword\"]/div[4]/div/button");
	static By copytoClipboard=By.xpath("//*[@id=\"btnGeneratePasswordInsert\"]");
	static By closeGenerator=By.xpath("//*[@id=\"modalGeneratePassword\"]/div/div/div[3]/button[1]");
	
	public static WebElement newaccount(WebDriver driver) {
		element=driver.findElement(newAccountLink);
		return element;
	}

	public static WebElement firstName(WebDriver driver) {
		element=driver.findElement(firstNamefield);
		return element;
	}
	public static WebElement lastname(WebDriver driver) {
		element=driver.findElement(lastNameField);
		return element;
	}
	public static WebElement emailaddress(WebDriver driver){
		element=driver.findElement(EmailField);
		return element;
	}
	public static WebElement phonenumberfield(WebDriver driver) {
		element =driver.findElement(phoneNumberfield);
		return element;
	}
	public static WebElement companyNameField(WebDriver driver) {
		element=driver.findElement(companynameField);
		return element;
	}
	public static WebElement companyAddress(WebDriver driver) {
		element=driver.findElement(companyAddressField);
		return element;
	}
	public static WebElement CityField(WebDriver driver) {
		element=driver.findElement(cityField);
		return element;
	}
	public static WebElement StateField(WebDriver driver) {
		element=driver.findElement(stateField);
		return element;
	}
	public static WebElement postalCode(WebDriver driver) {
		element=driver.findElement(postalCode);
		return element;
	}
	public static WebElement country(WebDriver driver) {
		element=driver.findElement(countryField);
		return element;
	}
	public static WebElement passwordField(WebDriver driver) {
		element=driver.findElement(passwordField);
		return element;
	}
	public static WebElement confirmPWD(WebDriver driver) {
		element=driver.findElement(passwordField);
		return element;
	}
	public static WebElement registrationbtn(WebDriver driver) {
		element=driver.findElement(registerBTN);
		return element;
	}
	public static WebElement generatePWDBTN(WebDriver driver) {
		element=driver.findElement(generatePWDBTN);
		return element;
	}
	public static WebElement copytoClipboard(WebDriver driver) {
		element=driver.findElement(copytoClipboard);
		return element;
	}
	public static WebElement closeGenerator(WebDriver driver) {
		element=driver.findElement(closeGenerator);
		return element;
	}
}
