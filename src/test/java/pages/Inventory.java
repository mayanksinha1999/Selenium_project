package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inventory {
	
//	WebDriver driver;
//	public Inventory(WebDriver driver) {
//		this.driver=driver;
//	}
	
	private static WebElement element;
	
	public static WebElement addToCart(WebDriver driver) {
		element=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		return element;
		
	}
	
	
//	@Test
//	public void addToCart() {
//		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//	}
}
