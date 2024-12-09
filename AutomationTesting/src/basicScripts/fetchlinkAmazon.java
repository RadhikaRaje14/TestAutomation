package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchlinkAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement link:links)
		{
		String url=link.getAttribute("href");
		System.out.println(url);
		//driver.quit();
		}
	}
}


