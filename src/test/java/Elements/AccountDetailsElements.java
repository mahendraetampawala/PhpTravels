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
	
	
	
	
}
