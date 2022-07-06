package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	
	private static WebElement element;
	//WebDriver driver;
	
//	public LoginPage(WebDriver driver) {
//		this.driver=driver;
//	}
	
	
	public static WebElement enterUsername(WebDriver driver) {
		element=driver.findElement(By.id("user-name"));
		return element;
	}
	
	public static WebElement enterPassword(WebDriver driver) {
		element=driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement clickLogin(WebDriver driver) {
		element=driver.findElement(By.id("login-button"));
		return element;
		
	}
	
//	By uName = By.id("user-name");
//	By pswd = By.id("password");
//	
//	@Test
//	public void enterUsername(String username) {
//		driver.findElement(uName).sendKeys(username);
//	}
//	
//	@Test
//	public void enterPassword(String password) {
//		driver.findElement(pswd).sendKeys(password);
//	}
//	
//	@Test
//	public void clickLogin() {
//		driver.findElement(By.id("login-button")).click();
//	}
}
