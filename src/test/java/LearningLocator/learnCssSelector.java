
package LearningLocator;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class learnCssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//identify the user name using tagname and attribute
		WebElement username=driver.findElement(By.cssSelector("input[name='user-name']"));
		username.sendKeys("error_user");
		
		//identify the password using attribute(id value)
		WebElement password=driver.findElement(By.cssSelector("#password"));
		password.sendKeys("secret_sauce");
		
		//identify the login button using id value
		WebElement loginbutton=driver.findElement(By.cssSelector("#login-button"));
		loginbutton.click();
		
		//identify the 1st product using text
		WebElement product=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		product.click();

		//add to cart using and operator
		WebElement atc=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart']"));
		atc.click();
		
		//identify the cart using tagname and attribute
		WebElement cart=driver.findElement(By.cssSelector("a[class='shopping_cart_link']"));
		cart.click();
		
		//identify the checkout using following
		WebElement checkout=driver.findElement(By.xpath("//button[@id='continue-shopping']/following :: button[@name='checkout']"));
		checkout.click();
		
		//identify the firstname using parent
		WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']/parent :: div/input"));
		firstname.sendKeys("abinaya");
		
		//identify the lastname using child
		WebElement lastname=driver.findElement(By.xpath("//div[@class='form_group']/child :: input[@name='lastName']"));
		lastname.sendKeys("esakki");
		
		//identify the zipcode using following
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='last-name']/following :: input[@name='postalCode']"));
		zipcode.sendKeys("627004");
		
		//click the continue using following sibling
		WebElement clcontinue=driver.findElement(By.xpath("//button[@id='cancel']/following-sibling :: input[@name='continue']"));
		clcontinue.click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("finish"));
		
		//click the finish using text 
		WebElement finish = driver.findElement(By.id("finish"));
		finish.click();

	}

}
