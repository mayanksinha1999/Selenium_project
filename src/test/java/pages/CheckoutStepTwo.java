package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutStepTwo {
	WebDriver driver;
	public CheckoutStepTwo(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@Test
	public void clickFinish() {
		driver.findElement(By.id("finish")).click();
	}
}
