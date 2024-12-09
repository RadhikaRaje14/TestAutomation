package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openNewTabSwitch {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement click=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));

		Actions act=new Actions(driver);
		act.contextClick(click).perform();
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T); 
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		
		ArrayList<String> l=new ArrayList<String>(allwindow);
		String var=l.get(1);
		
		driver.switchTo().window(var);
		Thread.sleep(1000);
		
		String var1=l.get(0);
		driver.switchTo().window(var1);
		
	    driver.close();
	}

}
