package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class QspiderScroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		

		Set<String> allwh=driver.getWindowHandles();
		ArrayList<String> wh=new ArrayList<String>(allwh);

			for(String str:wh)
			{
				Thread.sleep(2000);
			driver.switchTo().window(str);
			}
			
			WebElement ele=driver.findElement(By.xpath("//input[@type='checkbox']"));//locate the ele
			ele.click();
			
			Point p=ele.getLocation();//get the y-coordinate of the ele
			int y=p.getY();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,"+y+")");
			Thread.sleep(1000);
			
			WebElement ele1=driver.findElement(By.xpath("//button[text()='Accept Our Policy']"));//locate the ele
			ele1.click();
	
			String photo="./Photos/";
			Date d=new Date();
			String d1=d.toString();
			String d2=d1.replaceFirst(":","-");
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dst=new File(photo+d2+".jpeg");
			FileHandler.copy(src,dst);
			driver.quit();
		}
		

	}

