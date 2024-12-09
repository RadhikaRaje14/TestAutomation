package Sychronization;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitwait1
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/disabled?sublist=4");
		
		WebDriverWait wait=new WebDriverWait(driver,50);//initialize webdriverwait
		
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("2");
		
		WebElement ele1=driver.findElement(By.xpath("//button[text()='Start']"));
		ele1.click();
		
		WebElement ele2=wait.until(ExpectedConditions.visibilityOfElementLocated
				                  (By.xpath("//p[.='Do you like Automation']")));
		
	//	WebElement ele2=driver.findElement(By.xpath("//p[.='Do you like Automation']"));
		//wait.until(ExpectedConditions.visibilityOf(ele2));
				
		String photo="./Photos/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) ele2;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+"explicit1.jpeg");
		FileHandler.copy(src,dst);
		driver.quit();

	}

}
