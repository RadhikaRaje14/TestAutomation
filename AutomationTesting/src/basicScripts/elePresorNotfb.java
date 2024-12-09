package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elePresorNotfb 
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			                                                                    
			boolean b=ele.isDisplayed();
			if(b)
			{
				System.out.println("Element Displayed");
			}
			else
			{
				System.out.println("Element not displayed");
			}
			driver.close();			
		}

}


