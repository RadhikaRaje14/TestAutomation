package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipMobSwitchScrollBuy {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		String child_add=l.get(1);
		{
			driver.switchTo().window(child_add);
		}
		
		Thread.sleep(15000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		driver.quit();
	}

}
