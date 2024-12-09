package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewSelePgScrollSwitch {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Downloads']"));		
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele2=driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3=driver.findElement(By.xpath("//span[text()='Support']"));
		
		
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(ele);
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		
		Robot r=new Robot();	
		Actions act=new Actions(driver);
		
		for (WebElement we:l)
		{
		act.contextClick(we).perform();
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
	}
		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> wh=new ArrayList<String>(allwh);

			for(String str:wh)
			{
				Thread.sleep(2000);
			driver.switchTo().window(wh.get(2));
		}
			driver.quit();
}
}