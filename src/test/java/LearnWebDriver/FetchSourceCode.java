package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchSourceCode {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//maximize the page
		driver.manage().window().maximize();
		//navigate via url
		driver.get("https://www.selenium.dev/");
		//fetch source code and print
		System.out.println(driver.getPageSource());
		//close the page
		driver.close();
		

	}

}
