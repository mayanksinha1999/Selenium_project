package appModule;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class SignIn {
	
	
	public static void Execute(WebDriver driver, String username, String password) {
		LoginPage.enterUsername(driver).sendKeys(username);
		LoginPage.enterPassword(driver).sendKeys(password);
		LoginPage.clickLogin(driver).click();
	}
}
