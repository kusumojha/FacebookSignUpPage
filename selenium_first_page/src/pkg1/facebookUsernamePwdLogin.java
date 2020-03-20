package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookUsernamePwdLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","../selenium_first_page/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement user_name=driver.findElement(By.name("email"));//for user_name
		user_name.sendKeys("ojhakusum@gmail.com");//for passing value
	    WebElement pwd=driver.findElement(By.cssSelector("input#pass"));
	    pwd.sendKeys("kusum@123");//wrong pwd
		//WebElement password=driver.findElement(By.name("pass"));
		//password.sendKeys("kusum@123");
		WebElement login=driver.findElement(By.cssSelector("label#loginbutton"));
	    login.click();
		
		
		
		
	}

}
