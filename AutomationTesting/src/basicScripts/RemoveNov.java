package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveNov 
{
//remove November from Dropdown
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> opts=s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		
		for(WebElement we:opts)
		{
			String t=we.getText();
			l.add(t);
		}
			l.remove("Nov");
	
			for(String month : l)
			{
				System.out.println(month);
		
			}
			driver.quit();
	}
}
