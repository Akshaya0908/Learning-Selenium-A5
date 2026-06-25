package LearnWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchWindowAddress {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//get window handle
		String parentadd=driver.getWindowHandle();
		///print the address
		System.out.println(parentadd);
		//refresh the page
		driver.navigate().refresh();
		//print the address again
		System.out.println(driver.getWindowHandle());
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//navigate via url
		driver.navigate().to("https://chatgpt.com/");
		//fetch the parent and child address
	    Set<String> alladdress=driver.getWindowHandles();
	    System.out.println(alladdress);
	    // close the page
	    driver.quit();
	    
		
	}

}
