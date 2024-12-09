package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class copyPaste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/copypaste.html");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement ele=driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL+"ax");
				
		WebElement ele1=driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
				
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.CONTROL+"AX");
	
		ele.sendKeys(Keys.CONTROL+"v");
						
		ele1.sendKeys(Keys.CONTROL+"AX");
	
		ele2.sendKeys(Keys.CONTROL+"v");
		
		driver.close();
	}
}
