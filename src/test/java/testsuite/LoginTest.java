package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	WebDriver driver;
		
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Full Stack\\Java Workspace\\WebDriverProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "D:\\Full Stack\\Java Workspace\\WebDriverProject\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize(); // to maximize the browser window.
		
		//wait time before executing any of the other command
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	@Parameters({"username","passward"})
	@Test
	public void login(String Username, String Passward) {
		
		LoginPage login = new LoginPage(driver);
		login.loginMethod(Username, Passward);

	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
