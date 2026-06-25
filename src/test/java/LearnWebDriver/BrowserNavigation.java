package LearnWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev");
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.meesho.com/"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
