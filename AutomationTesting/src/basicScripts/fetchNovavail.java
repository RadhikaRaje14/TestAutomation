package basicScripts;

import java.util.ArrayList;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//typecasting
public class fetchNovavail 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele=driver.findElement(By.id("month"));
		
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement we:opt)
		{
			String t=we.getText();
			l.add(we);
		}
		
	}
	
		TreeSet<String> t1=new TreeSet<String>(l);
		{
			String t1=we.getText();
		}
}
		
	

