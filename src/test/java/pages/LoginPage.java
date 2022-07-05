package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By uName = By.id("user-name");
	By pswd = By.id("password");
	
	@Test
	public void enterUsername(String username) {
		driver.findElement(uName).sendKeys(username);
	}
	
	@Test
	public void enterPassword(String password) {
		driver.findElement(pswd).sendKeys(password);
	}
	
	@Test
	public void clickLogin() {
		driver.findElement(By.id("login-button")).click();
	}
}
