package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");//open main url
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		
		Set<String> allwh=driver.getWindowHandles();//handle multiple window
		String p_id=driver.getWindowHandle();
		allwh.remove(p_id);
				
		//switch to the new window
		for(String str:allwh)
		{
			Thread.sleep(2000);
		driver.switchTo().window(str);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rajshree");
		Thread.sleep(2000);
		driver.close();
		}
		driver.switchTo().window(p_id);//switch back to parent
		
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();//2 tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		Thread.sleep(1000);
		
		Set<String> allwh1=driver.getWindowHandles();//handle multiple window
		String p_id1=driver.getWindowHandle();
		allwh1.remove(p_id1);
				
		//switch to the new window
		for(String str1:allwh1)
		{
		driver.switchTo().window(str1);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Radhika");
		//Thread.sleep(2000);
		//driver.close();
		}
		driver.switchTo().window(p_id);
		
		driver.findElement(By.xpath("//a[text()='New Tab']")).click();//2 tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		Thread.sleep(1000);
		
		Set<String> allwh2=driver.getWindowHandles();//handle multiple window
		String p_id2=driver.getWindowHandle();
		allwh1.remove(p_id2);		
		//switch to the new window
		for(String str2:allwh2)
		{
		driver.switchTo().window(str2);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Arya");
		Thread.sleep(2000);
		driver.close();
		}
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Click to open multiple popup windows']")).click();
		Set<String> allwh3=driver.getWindowHandles();//handle multiple window
		String p_id3=driver.getWindowHandle();
		allwh1.remove(p_id3);		
		
		//switch to the new window
		for(String str3:allwh3)
		{
		driver.switchTo().window(str3);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kavnekar");
		Thread.sleep(2000);
		driver.close();
		}
		}
}