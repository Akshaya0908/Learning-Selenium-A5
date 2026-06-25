package LearningWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class learnFetchValue { //cascade testing 

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement element = driver.findElement(By.xpath("//div[text()='Swag Labs']"));

		String actualtext = element.getText();
		System.out.println(actualtext);
		String exptext = "Swag Labs";
		if (exptext.equals(actualtext)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String actualtag = element.getTagName();
		System.out.println(actualtag);
		String exptag = "div";
		if (exptag.equals(actualtag)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String actualattvalue = element.getAttribute("class");
		System.out.println(actualattvalue);
		String expval = "login_logo";
		if (expval.equals(actualattvalue)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String actualcss = element.getCssValue("font-family");
		System.out.println(actualcss);
		String expcss = "\"DM Mono\", \"sans-serif\"";
		if (expcss.equals(actualcss)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		Dimension actualsize = element.getSize();
		int actualwidth = actualsize.getWidth();
		int actualheight = actualsize.getHeight();
		
		System.out.println(actualsize);
		System.out.println(actualwidth);
		System.out.println(actualheight);

		int expwidth = 1021;
		int expheight = 108;
		if (expwidth==actualwidth && expheight==actualheight) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		Point actualloc = element.getLocation();
		int actualx = actualloc.getX();
		int actualy = actualloc.getY();
		System.out.println(actualloc);
		System.out.println(actualx);
		System.out.println(actualy);
		
		int expx = 0;
		int expy = 0;
		if (expx==actualx && expy==actualy) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
