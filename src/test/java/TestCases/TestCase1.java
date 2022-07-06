package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModule.SignIn;
import pages.Cart;
import pages.CheckoutStepOne;
import pages.CheckoutStepTwo;
import pages.Inventory;
import pages.LoginPage;
import utility.Constant;

public class TestCase1 {
	
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver =new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		
//		LoginPage.enterUsername(driver).sendKeys("standard_user");
//		LoginPage.enterPassword(driver).sendKeys("secret_sauce");
//		LoginPage.clickLogin(driver).click();
		SignIn.Execute(driver, Constant.Username, Constant.Password);
		Thread.sleep(2000);
		Inventory.addToCart(driver).click();
		
		Cart.clickCart(driver).click();
		Cart.checkout(driver).click();
		Thread.sleep(2000);
		
		CheckoutStepOne.enterFirstname(driver).sendKeys("Mayank");
		CheckoutStepOne.enterLastname(driver).sendKeys("Sinha");
		CheckoutStepOne.enterZipcode(driver).sendKeys("201001");
		Thread.sleep(2000);
		Constant.scrollDown(driver);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		Constant.scrollUp(driver);
		CheckoutStepOne.clickContinue(driver).click();
//		js.executeScript("window.scrollBy(0,-250)");
		Thread.sleep(2000);
		Constant.scrollDown(driver);
//		js.executeScript("window.scrollBy(0,250)");
		CheckoutStepTwo.clickFinish(driver).click();
		//js.executeScript("window.scrollBy(0,-250)");
		Constant.scrollUp(driver);
		

	}
}
