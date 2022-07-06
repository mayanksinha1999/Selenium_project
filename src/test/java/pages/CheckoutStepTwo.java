package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutStepTwo {
	
	private static WebElement element;
	
	public static WebElement clickFinish(WebDriver driver) {
		element=driver.findElement(By.id("finish"));
		return element;
	}
//	WebDriver driver;
//	public CheckoutStepTwo(WebDriver driver) {
//		this.driver=driver;
//	}
//	
//	
//	@Test
//	public void clickFinish() {
//		driver.findElement(By.id("finish")).click();
//	}
}
