package UplaodFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooSignup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("rajshreerk14@yahoo.com");
		driver.findElement(By.id("pwd")).click();
				
		driver.findElement(By.id("loginbutton")).sendKeys("housequeen14radha");
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		
		driver.findElement(By.xpath("div[text()='Reports']")).click();
		
		driver.findElement(By.xpath("//div[.='Users']")).click();
		//WebElement ele=driver.findElement(By.cssSelector("[role='button']"));
		//ele.click();
		
	//	driver.get("https://mail.yahoo.com/d/compose/2435513520");
	
		

		//driver.findElement(By.id("message-to-field")).sendKeys("radhikaraj1914@gmail.com");
		//driver.findElement(By.id("compose-subject-input")).sendKeys("Hey check this file");
		
		
		
		
		
		
		
		
	}

}
