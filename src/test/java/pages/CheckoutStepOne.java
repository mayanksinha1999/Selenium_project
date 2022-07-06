package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutStepOne {
	
	
	private static WebElement element;
	
	public static WebElement enterFirstname(WebDriver driver) {
		element=driver.findElement(By.id("first-name"));
		return element;
	}
	
	public static WebElement enterLastname(WebDriver driver) {
		element=driver.findElement(By.id("last-name"));
		return element;
	}
	
	public static WebElement enterZipcode(WebDriver driver) {
		element=driver.findElement(By.id("postal-code"));
		return element;
	}
	
	public static WebElement clickContinue(WebDriver driver) {
		element=driver.findElement(By.id("continue"));
		return element;
	}
	
//	WebDriver driver;
//	public CheckoutStepOne(WebDriver driver) {
//		this.driver=driver;
//	}
//	
//	By fname=By.id("first-name");
//	By lname=By.id("last-name");
//	By postal=By.id("postal-code");
//	By cont=By.id("continue");
//	
//	@Test
//	public void enterFirstname(String firstname) {
//		driver.findElement(fname).sendKeys(firstname);
//	}
//	
//	@Test
//	public void enterLastname(String lastname) {
//		driver.findElement(lname).sendKeys(lastname);
//	}
//	
//	@Test
//	public void enterZipcode(String zipcode) {
//		driver.findElement(postal).sendKeys(zipcode);
//	}
//	
//	@Test
//	public void clickContinue() {
//		driver.findElement(cont).click();
//	}
}
