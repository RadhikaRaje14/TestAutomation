package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettext {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		for (WebElement we:links)
		{
			System.out.println(we.getText());
		}

	}

}
