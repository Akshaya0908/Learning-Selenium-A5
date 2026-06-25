package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_validationurl {

	public static void main(String[] args) {
		//step1 open browser
		WebDriver driver=new ChromeDriver();
		
		//step2 nav to app via url
		driver.get("https://www.naukri.com/");
		
		//step3 expected url
		String expurl="https://www.naukri.com/";
		
		//step4 actual url by using getcurrenturl method
		String acturl=driver.getCurrentUrl();
		
		//step5 using equalsofmethod
		if(expurl.equals(acturl)) {
			System.out.println("Title-verified:pass" +acturl);
		}else {
			System.out.println("Title-verified:fail"+acturl);
		}
		
		//step6 close
		driver.quit();
		System.out.println("Execution done");
	}
}
