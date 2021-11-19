package loginPageTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPageTests {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		By txtUsername = By.id("txtUsername");
		By txtPass = By.cssSelector("#txtPassword");
		By btnLogin = By.name("Submit");
		By forgotPassLbl = By.cssSelector("#forgotPasswordLink");
		By adminTab = By.id("menu_admin_viewAdminModule");
		By logoImage = By.cssSelector("#divLogo > img");
		By jobTab = By.id("menu_admin_Job");
		By organizationTab = By.id("menu_admin_Organization");
		By userManagementTab = By.id("menu_admin_UserManagement");
		By qualificationsTab = By.id("menu_admin_Qualifications");
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Page title: " + driver.getTitle());
		
		//Logging in
		driver.findElement(txtUsername).sendKeys("Admin");
		driver.findElement(txtPass).sendKeys("admin123");
		driver.findElement(btnLogin).click();
		

		driver.findElement(adminTab).click();
		
		//Extracting tabs text
		ArrayList<String> adminOptions = new ArrayList<String>();
		adminOptions.add(driver.findElement(userManagementTab).getText());
		adminOptions.add(driver.findElement(jobTab).getText());
		adminOptions.add(driver.findElement(organizationTab).getText());
		adminOptions.add(driver.findElement(qualificationsTab).getText());
		
		List<String> searchElementsList = Arrays.asList("User Management" ,"Job", "Organization", "Qualifications");
		
		//Validating tabs
				for (String item : searchElementsList) {
					if(adminOptions.contains(item))
							System.out.println("Tab " + item + " exists");
							else 
								System.out.println("Tab " + item + " don't exists");
							}
				
		
		driver.close();

	}

}
