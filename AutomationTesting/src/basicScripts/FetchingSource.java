package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchingSource {

			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.amazon.in");
				Thread.sleep(2000);
				List<WebElement> images = driver.findElements(By.xpath("//a"));
				for (WebElement image:images)
				{
				String imgsrc=image.getAttribute("src");
				System.out.println(imgsrc);
				//driver.quit();
				}
			}
	}

