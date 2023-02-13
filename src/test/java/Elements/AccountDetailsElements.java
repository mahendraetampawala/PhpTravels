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
public class AccountDetailsElements {
	
	private static WebElement element=null;
	
	static By updateButtonXpath=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[1]/div[1]/div/div[3]/a");
	static By fistnameField=By.id("inputFirstName");
	static By address1Field=By.id("inputAddress1");
	static By lastNameField=By.id("inputLastName");
	static By Address2Field=By.id("inputAddress2");
	static By companyField=By.id("inputCompanyName");
	static By cityField=By.id("inputCity");
	static By EmailField=By.id("inputEmail");
	static By stateField=By.id("stateinput");
	static By paymentField=By.id("inputPaymentMethod");
	static By zipcodeField=By.id("inputPostcode");
	static By BillinField=By.id("inputBillingContact");
	static By countryField=By.id("country");
	static By mobileField2=By.id("customfield2");
	static By phoneNumberField=By.id("inputPhone");
	static By GenerateEmailCheckBox=By.id("generalEmails");
	static By InvoiceCheckBox=By.id("invoiceEmails");
	static By supportCheckBox=By.id("supportEmails");
	static By productEmailsField=By.id("productEmails");
	static By domainEmailsField=By.id("domainEmails");
	static By affiliateEmailsField=By.id("affiliateEmails");
	static By SaveButton=By.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/form/div[4]/input[1]");
	

	public static WebElement updateButton(WebDriver driver) {
		element=driver.findElement(updateButtonXpath);
		return element;
	
	}
	public static WebElement firstname(WebDriver driver) {
		element=driver.findElement(fistnameField);
		return element;
	
	}
	public static WebElement address2(WebDriver driver) {
		element=driver.findElement(address1Field);
		return element;
	}
	public static WebElement lastName(WebDriver driver) {
		element=driver.findElement(lastNameField);
		return element;
	}
	public static WebElement Address2Field(WebDriver driver) {
		element=driver.findElement(Address2Field);
		return element;
	}
	public static WebElement companyName(WebDriver driver) {
		element=driver.findElement(companyField);
		return element;
	}
	public static WebElement cityField(WebDriver driver) {
		element =driver.findElement(cityField);
		return element;
	}
	public static WebElement Email(WebDriver driver) {
		element=driver.findElement(EmailField);
		return element;
	}
	public static WebElement State(WebDriver driver) {
		element=driver.findElement(stateField);
		return element;
	}
	public static WebElement payment(WebDriver driver) {
		element=driver.findElement(paymentField);
		return element;
	}
	public static WebElement ZipCode(WebDriver driver) {
		element=driver.findElement(zipcodeField);
		return element;
	}
	public static WebElement BillingAdd(WebDriver driver) {
		element =driver.findElement(BillinField);
		return element;
	}
	
	public static WebElement mobileNUmber2(WebDriver driver) {
		element=driver.findElement(mobileField2);
		return element;
	}
	public static WebElement phoneNumber(WebDriver driver) {
		element=driver.findElement(phoneNumberField);
		return element;
	}
	public static WebElement GenerateEmailCheckBox(WebDriver driver) {
		element=driver.findElement(GenerateEmailCheckBox);
		return element;
	}
	public static WebElement InvoiceCheckBox(WebDriver driver) {
		element=driver.findElement(InvoiceCheckBox);
		return element;
	}
	public static WebElement supportCheckBox(WebDriver driver) {
		element=driver.findElement(supportCheckBox);
		return element;
	}
	public static WebElement productEmailsField(WebDriver driver) {
		element=driver.findElement(productEmailsField);
		return element;
	}
	public static WebElement domainEmailsField(WebDriver driver) {
		element=driver.findElement(domainEmailsField);
		return element;
	}
	public static WebElement affiliateEmailsField(WebDriver driver) {
		element=driver.findElement(affiliateEmailsField);
		return element;
	}
	public static WebElement SaveButton(WebDriver driver) {
		element=driver.findElement(SaveButton);
		return element;
	}
	
	
}
