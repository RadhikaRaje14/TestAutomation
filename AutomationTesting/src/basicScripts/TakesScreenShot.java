package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		//step1
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step2
		File src=ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst=new File("C:\\Users\\radhi\\OneDrive\\Desktop\\Pictures");
		//step4
		FileHandler.copy(src,dst);

	}

}
