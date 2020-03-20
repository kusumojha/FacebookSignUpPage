package pkg1;



import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\java\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
	Options o=driver.manage();
	Window w=o.window();
	w.maximize();
	
		
	}
	
	
	


}
