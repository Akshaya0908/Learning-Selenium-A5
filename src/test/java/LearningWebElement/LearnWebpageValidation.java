package LearningWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebpageValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		WebElement signupuser=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		signupuser.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		name.sendKeys("Abinaya");
		
		WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("abi8775@gmail.com");
		
		WebElement signup=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signup.click();
		
		WebElement radio=driver.findElement(By.xpath("//input[@id='id_gender2']"));
		
		boolean displayedradio=radio.isDisplayed();
		boolean enabledradio=radio.isEnabled();
		boolean selectedradio=radio.isSelected();
		System.out.println(selectedradio);
		
		if(displayedradio && enabledradio && selectedradio) {
			System.out.println("Radiobutton is working fine:");
		}
		else {
			System.out.println("Radiobutton is not working fine:");
		}
	 radio=driver.findElement(By.xpath("//input[@id='id_gender2']"));

		radio.click();
		System.out.println("-----------------------------------------------");
		System.out.println(radio.isSelected());

		if(radio.isDisplayed() && radio.isEnabled() && radio.isSelected()) {
			System.out.println("Radiobutton is working fine:");
		}
		else {
			System.out.println("Radiobutton is not working fine:");
		}
		
	
	driver.quit();
	}	

}
