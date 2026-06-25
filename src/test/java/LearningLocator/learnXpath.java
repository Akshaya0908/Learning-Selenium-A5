package LearningLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//navigate to browser
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//identify the register using text
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		
		//click the register button
		register.click();
		
		//identify the gender by using attribute
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//click the gender
		gender.click();
		
		//identify the first name by using backward direction
		WebElement firstname=driver.findElement(By.xpath("//input[@class='text-box single-line']/..//input[@name='FirstName']"));
		firstname.sendKeys("Akshaya");
		
		//identify the last name by using parent
		WebElement lastname=driver.findElement(By.xpath("//input[@class='text-box single-line']/parent::div/input[@id='LastName']"));
		lastname.sendKeys("Esakki");
		
		//identify the email using the child
		WebElement email=driver.findElement(By.xpath("//div[@class='inputs']/child::input[@id='Email']"));
		email.sendKeys("akshayaesa01@gmail.com");
		
		//identify the password by using preceding sibling
		WebElement password=driver.findElement(By.xpath("//span[@class='field-validation-valid']/preceding-sibling :: input[@id='Password']"));
		password.sendKeys("Abi@2510");
		
		//identify the confirm password by AND operator
		WebElement confirmpass=driver.findElement(By.xpath("//input[@class='text-box single-line password' and @id='ConfirmPassword']"));
		confirmpass.sendKeys("Abi@2510");
		
		//identify the register button by using descendant or following 
		WebElement regbutton=driver.findElement(By.xpath("//label[@for='Password']/following :: input[@id='register-button']"));
		regbutton.click();
		
		
	
	}

}
