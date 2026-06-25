package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class HandlingWebTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int n=sc.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/webtable/");
		
		//3rd row 2nd data
		WebElement name=driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
		System.out.println(name.getText());
		System.out.println("--------------------------------");
		
		//all the employee name
		List<WebElement> empnames=driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
		for(WebElement names:empnames) {
		System.out.println(names.getText());
		}
		System.out.println("--------------------------------");
		
		//3rd row of the details
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
		for(WebElement data:row) {
		System.out.println(data.getText());
		}
		System.out.println("--------------------------------");
		
		//nth row of details
		List<WebElement> nrow=driver.findElements(By.xpath("//table[@id='myTable']//tr["+n+"]/td"));
		for(WebElement rows:nrow) {
			System.out.println(rows.getText());
		}
		
		

	}

	

}
