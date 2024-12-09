package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupRedbus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='21']")).click();
		Thread.sleep(1000);
		
	
	}

}
