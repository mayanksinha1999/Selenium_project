package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cart {
	
	
	private static WebElement element;
	
	public static WebElement clickCart(WebDriver driver) {
		element=driver.findElement(By.className("shopping_cart_link"));
		return element;
	}
	
	public static WebElement checkout(WebDriver driver) {
		element=driver.findElement(By.id("checkout"));
		return element;
	}
	
//	WebDriver driver;
//	public Cart(WebDriver driver) {
//		this.driver=driver;
//	}
//	
//	@Test
//	public void clickCart() {
//		driver.findElement(By.className("shopping_cart_link")).click();
//	}
//	
//	@Test
//	public void checkout() {
//		driver.findElement(By.id("checkout")).click();
//	}
}
