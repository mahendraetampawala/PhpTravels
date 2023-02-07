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
public class LoginElements {
	
	private static WebElement element=null;
	
	
	static By inputEmailID=By.id("inputEmail");
	static By inputPasswordID=By.id("inputPassword");
	static By loginBtn=By.id("login");
	
	
	public static WebElement inputEmailElementID(WebDriver driver) {
		element=driver.findElement(inputEmailID);
		return element;
	}
	public static WebElement inputPasswordId(WebDriver driver) {
		element=driver.findElement(inputPasswordID);
		return element;
	}
	public static WebElement loginButton(WebDriver driver) {
		element=driver.findElement(loginBtn);
		return element;
	}

}
