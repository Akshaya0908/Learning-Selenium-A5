package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnId {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize the page
		driver.manage().window().maximize();
		//navigate via url
		driver.get("https://www.saucedemo.com/");
		//identify web element
		WebElement intxfld=driver.findElement(By.id("user-name"));
		intxfld.sendKeys("standard_user");
		WebElement ptxtfld=driver.findElement(By.id("password"));
		ptxtfld.sendKeys("secret_sauce");
		//close the page
		driver.close();
		

	}

}
