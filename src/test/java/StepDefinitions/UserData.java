/**
 * 
 */
package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author mahen
 *
 */
public class UserData {
	WebDriver driver=null;
	public String link="https://phptravels.org/login";
	public String email="mahendraetampawala98@gmail.com";
	public String newmail="mahendraetampawalaaaa98@gmail.com";
	public String password="Mahendra1125";
	public String firstname="Mahendra";
	public String lastname="Etampawala";
	public String phone="0769917579";
	public String company="Konnect";
	public String address="23/A Colombo 10";
	public String city="Kandy";
	public String state="Central Province";
	public String country="Sri Lanka";
	public String postalcode="20450";
	public String newcontactmail="mahendra@gmail.com";
	public String clientDashBoard="https://phptravels.org/clientarea.php";
	public void userData() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to(link);
	}
	
}
