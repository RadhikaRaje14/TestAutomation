package basicScripts;

import java.io.File;
import java.io.IOException;
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

public class scrolDownScUpTakepic {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='About Amazon']"));
		
		Point p=ele.getLocation();
		int y=p.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		String photo="./photos/";
		
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot) ele;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src,dst);
		
		js.executeScript("window.scrollBy(0,"+-y+")");
		WebElement ele1=driver.findElement(By.xpath("//span[.='Prime']"));
		
		TakesScreenshot ts1=(TakesScreenshot) ele1;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File dst1=new File(photo+d2+".jpeg");
		FileHandler.copy(src1,dst1);		
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		
		WebElement ele2=driver.findElement(By.xpath("//div[@id='navFooter']"));
		driver.close();
		//String photo="./photos/"
		
		
//driver.quit();
	}

}
