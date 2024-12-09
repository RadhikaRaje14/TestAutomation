package Sychronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	//	String title=driver.getTitle();
		//System.out.println(title);
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		//driver.findElement(By.id("email")).sendKeys("rajshreerk14@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("rajshree");
		
		//driver.findElement(By.name("login")).click();	
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		//driver.findElement(By.id("email")).sendKeys("rajshreerk14@yahoo.com");
		//driver.findElement(By.id("pass")).sendKeys("rajshree");
		//driver.findElement(By.name("login")).click();	
		
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("rajshreerk14@yahoo.com");
		wait.until(ExpectedConditions.visibilityOf(ele));
		driver.quit();

	}

}
