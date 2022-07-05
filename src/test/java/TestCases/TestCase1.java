package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Cart;
import pages.CheckoutStepOne;
import pages.CheckoutStepTwo;
import pages.Inventory;
import pages.LoginPage;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginPage login=new LoginPage(driver);
		Inventory invent=new Inventory(driver);
		Cart cart=new Cart(driver);
		CheckoutStepOne check=new CheckoutStepOne(driver);
		CheckoutStepTwo checktwo=new CheckoutStepTwo(driver);
		
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		Thread.sleep(2000);
		login.clickLogin();
		Thread.sleep(3000);
		
		invent.addToCart();
		Thread.sleep(2000);
		
		cart.clickCart();
		Thread.sleep(1000);
		cart.checkout();
		Thread.sleep(1000);
		
		
		check.enterFirstname("Mayank");
		Thread.sleep(1000);
		check.enterLastname("Sinha");
		Thread.sleep(1000);
		check.enterZipcode("201001");
		Thread.sleep(1000);
		check.clickContinue();
		Thread.sleep(2000);
		
		checktwo.clickFinish();
		Thread.sleep(2000);
		
		//driver.quit();
	}
}
