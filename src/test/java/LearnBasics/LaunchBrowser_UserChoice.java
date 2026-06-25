package LearnBasics;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser_UserChoice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for chrome and 2 edge");
		int option=sc.nextInt();
		if(option==1) {
			new ChromeDriver();
		}
		else if(option==2){
			new EdgeDriver();
		}
		else {
			System.out.println("Invalid option");
		}
	}
}
