package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passnCLear {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/passnClear.html");
		List<WebElement> txt=driver.findElements(By.xpath("//input"));
		Thread.sleep(5000);
		driver.manage().window().maximize();

		int count=txt.size();
		for(int i=0;i<count;i++)
		{
			WebElement we=txt.get(i);
			we.sendKeys("Selenium");
		}
		Thread.sleep(3000);
		for(int j=count-1;j>=0;j--)
		{
			WebElement we=txt.get(j);
			we.clear();
			
		}
		driver.quit();

	}

}