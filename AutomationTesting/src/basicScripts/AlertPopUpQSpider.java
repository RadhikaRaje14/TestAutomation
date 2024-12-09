package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpQSpider {

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
			Thread.sleep(1000);
			
			driver.findElement(By.id("buttonAlert2")).click();
			Thread.sleep(1000);
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			
			driver.findElement(By.xpath("//a[text()='Confirm']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("buttonAlert5")).click();
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			a1.accept();
			
			driver.findElement(By.xpath("//a[text()='Prompt']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("buttonAlert1")).click();
			Alert a2=driver.switchTo().alert();
			a2.sendKeys("yes");
			Thread.sleep(2000);
			a2.accept();
			

	}

}
