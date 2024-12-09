package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//perform select and deselect checkbox
public class checkboxascdesc {
//keybord function
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/checkbox1.html/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement ele1=driver.findElement(By.id("a1"));
		ele1.sendKeys(Keys.SPACE);
	
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.SPACE);
		//Thread.sleep(2000);
		
		WebElement ele3=driver.findElement(By.id("a3"));
		ele3.sendKeys(Keys.SPACE);
		//Thread.sleep(2000);
		
		WebElement ele4=driver.findElement(By.id("a4"));
		ele4.sendKeys(Keys.SPACE);

		//Thread.sleep(2000);
		WebElement ele5=driver.findElement(By.id("a5"));
		ele5.sendKeys(Keys.SPACE);
		
		//deselected
		ele5.sendKeys(Keys.SPACE);
		ele4.sendKeys(Keys.SPACE);
		ele3.sendKeys(Keys.SPACE);		
		ele2.sendKeys(Keys.SPACE);		
		ele1.sendKeys(Keys.SPACE);




	}

}
