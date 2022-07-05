package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutStepOne {
	
	
	WebDriver driver;
	public CheckoutStepOne(WebDriver driver) {
		this.driver=driver;
	}
	
	By fname=By.id("first-name");
	By lname=By.id("last-name");
	By postal=By.id("postal-code");
	By cont=By.id("continue");
	
	@Test
	public void enterFirstname(String firstname) {
		driver.findElement(fname).sendKeys(firstname);
	}
	
	@Test
	public void enterLastname(String lastname) {
		driver.findElement(lname).sendKeys(lastname);
	}
	
	@Test
	public void enterZipcode(String zipcode) {
		driver.findElement(postal).sendKeys(zipcode);
	}
	
	@Test
	public void clickContinue() {
		driver.findElement(cont).click();
	}
}
