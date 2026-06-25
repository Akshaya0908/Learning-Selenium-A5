package HandlingJscode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class LearningJscode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//Steps to use js code
		//step 1
		JavascriptExecutor jseobj=(JavascriptExecutor)driver;
		
		//nav to app
		jseobj.executeScript("window.location=arguments[0]", "https://automationexercise.com/");
		
		//refresh
		jseobj.executeScript("history.go(0)");
		
		//fetch title
		System.out.println(jseobj.executeScript("return document.title"));
		
		//fetch url
		System.out.println(jseobj.executeScript("return document.URL"));
		
		//click the signup/login
		jseobj.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("Log")));
		
		//enter the name and email
		jseobj.executeScript("arguments[0].value='Akshaya'" , driver.findElement(By.name("name")));
		jseobj.executeScript("arguments[0].value='akshaya04@gmail.com'" , driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
		
		//click the signup
		jseobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[text()='Signup']")));
		
		//change the email in disable field
		jseobj.executeScript("arguments[0].value='akshayaesaa@gmail.com'" , driver.findElement(By.id("email")));
		
		//scroll
		jseobj.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//h2/b[text()='Address Information']")));
		Thread.sleep(3000);
		
		//scroll by (move from the previous point)
		jseobj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//scroll to (always move from starting of the origin)
		jseobj.executeScript("window.scrollTo(0,500)");
		
		System.out.println("Execution Done");
		
		
		
		
		
		
		
		
		
		
		

	}

}
