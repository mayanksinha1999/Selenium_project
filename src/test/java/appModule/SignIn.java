package appModule;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import utility.ExcelUtils;

public class SignIn {
	
	
	public static void Execute(WebDriver driver) throws Exception {
		
		String userName = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(1, 2);
		LoginPage.enterUsername(driver).sendKeys(userName);
		LoginPage.enterPassword(driver).sendKeys(password);
		LoginPage.clickLogin(driver).click();
	}
}
