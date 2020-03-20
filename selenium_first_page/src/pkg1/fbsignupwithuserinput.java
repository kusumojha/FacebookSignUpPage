package pkg1;
//error
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbsignupwithuserinput 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../selenium_first_page/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Scanner s=new Scanner(System.in);
	    String u=s.next();
		WebElement uname=driver.findElement(By.name("email"));
		uname.sendKeys(u);
		
		
	}

}
