package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//select all checkbox and deselect using forloop
public class countCheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/countCheckBox.html");
		List<WebElement> cb=driver.findElements(By.xpath("//input"));//it select all
		
		int count=cb.size();
		for(int i=0;i<count;i++)
		{
			WebElement we=cb.get(i);
			we.click();
		}
		for(int j=count-1;j>=0;j--)
		{
			WebElement we=cb.get(j);
			we.click();
			
		}

		driver.quit();
	}

}
