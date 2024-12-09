package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QspiderHiddenDi
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Arya");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Arya@gmail.com");
		//Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("fileInput"));
		ele.sendKeys("C:\\Users\\radhi\\OneDrive\\Desktop\\Pictures1.jpeg");
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		Thread.sleep(2000);
		WebElement ele11=driver.findElement(By.xpath("//div[text()='Upload File']"));
		ele11.sendKeys("C:\\Users\\radhi\\OneDrive\\Desktop\\Pictures1.jpeg");

		driver.quit();
	}

}
