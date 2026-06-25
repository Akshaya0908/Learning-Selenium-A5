package LearnWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingMechanism {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(new URL("https://www.meesho.com/"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
	}
}