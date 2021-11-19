package seleniumTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import gherkin.lexer.Is;

public class SeleniumWithTestNGTests {

	WebDriver driver;
	WebDriverWait wait;
	
	By txtUsername = By.id("txtUsername");
	By txtPass = By.cssSelector("#txtPassword");
	By btnLogin = By.name("Submit");
	By adminTab = By.cssSelector("#menu_admin_viewAdminModule");
	By pimTab = By.cssSelector("#menu_pim_viewPimModule");
	By leaveTab = By.cssSelector("#menu_leave_viewLeaveModule");
	By timeTab = By.id("menu_time_viewTimeModule");
	By recruitmentTab = By.cssSelector("#menu_recruitment_viewRecruitmentModule");
	By dashboardTab = By.cssSelector("#menu_dashboard_index");
	By directoryTab = By.cssSelector("#menu_directory_viewDirectory");
	By maintenanceTab = By.cssSelector("#menu_maintenance_purgeEmployee");
	By forgotPassLbl = By.cssSelector("#forgotPasswordLink");
	By logoImage = By.cssSelector("#divLogo > img");
	By jobTab = By.id("menu_admin_Job");
	By organizationTab = By.id("menu_admin_Organization");
	By userManagementTab = By.id("menu_admin_UserManagement");
	By qualificationsTab = By.id("menu_admin_Qualifications");
	By dashBoardHeader = By.cssSelector(".head h1");
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(txtUsername).sendKeys("Admin");
		driver.findElement(txtPass).sendKeys("admin123");
		driver.findElement(btnLogin).click();
	}
	
	@Test(dataProvider = "menuTabs", priority = 3)
	public void readDashBoardHeader(String option,By locator) {
		driver.findElement(locator).click();
		String dashBoardTxt = driver.findElement(dashBoardHeader).getText();
		System.out.println("Header for " + option + " option is: " + dashBoardTxt);
	}
	
	@Test(dataProvider = "menuTabs", priority = 2)
	public void pageTitlesText( String option, By locator) {
		driver.findElement(locator).click();
		System.out.println("Page title for " + option + " tab: " + driver.getTitle());
	}
	
	@DataProvider(name = "menuTabs")
	public Object[][] provider() {
		return new Object[][] {
			{"Admin", adminTab}, 
			{"PIM", pimTab},
			{"Leave", leaveTab},
			{"Time",timeTab},
			{"Recruitment", recruitmentTab},
			{"Dashboard", dashboardTab},
			{"Directory", directoryTab},
			{"Maintenance", maintenanceTab}
			};
	}
	
	public void minimizeWindow() {
		driver.manage().window().setPosition(new Point(-2000, 0));
	}
	
	
	@AfterSuite
	public void closeWebDriver() {
		minimizeWindow();
		driver.close();
	}
}
