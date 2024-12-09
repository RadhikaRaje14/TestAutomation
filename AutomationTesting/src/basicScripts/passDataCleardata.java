package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passDataCleardata {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/passnClear.html");
		Thread.sleep(15000);
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.id("a1"));
		ele1.sendKeys("Selenium");
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys("Java");
		WebElement ele3=driver.findElement(By.id("a3"));
		ele3.sendKeys("Manual");
		Thread.sleep(2000);
		
		ele3.sendKeys(Keys.CONTROL+"AX");
		Thread.sleep(2000);
	
		ele2.sendKeys(Keys.CONTROL+"A");
		ele2.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		
		ele1.sendKeys(Keys.CONTROL+"AX");
		Thread.sleep(2000);	
		
		driver.quit();
	
	}

}
