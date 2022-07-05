package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Cart {
	
	WebDriver driver;
	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	
	@Test
	public void clickCart() {
		driver.findElement(By.className("shopping_cart_link")).click();
	}
	
	@Test
	public void checkout() {
		driver.findElement(By.id("checkout")).click();
	}
}
