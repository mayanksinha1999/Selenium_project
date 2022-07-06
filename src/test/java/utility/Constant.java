package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Constant {
	
	public static final String URL = "https://www.saucedemo.com/";
	public static final String Username = "standard_user";
	public static final String Password = "secret_sauce";
	
	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	
	public static void scrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)");
	}
}
