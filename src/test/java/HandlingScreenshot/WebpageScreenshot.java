package HandlingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//step1
		TakesScreenshot ts=(TakesScreenshot)driver;
		//step2 & 3
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		//step4
		File permanentpath=new File("./src/test/resources/TestScreenshot/screenshot.png");
		//step5
		try {
			FileHandler.copy(temppath, permanentpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot taken!!");
		driver.close();

	}

}
