package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TSSinEclipse
{
	public static void getPhoto(WebDriver driver) throws IOException, InterruptedException
	{
		driver.get("https://www.youtube.com/");
		String photo="./Photos/";//path
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src,dst);
		System.out.println("Screenshot saved");
	}
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		
		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		getPhoto(driver);
	}
}
