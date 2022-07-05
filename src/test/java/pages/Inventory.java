package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Inventory {
	
	WebDriver driver;
	public Inventory(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@Test
	public void addToCart() {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	}
}
