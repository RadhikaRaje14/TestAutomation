package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class eleScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		//step1
		TakesScreenshot ts=(TakesScreenshot) ele;
		//step2
		File src=ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst=new File("C:\\Users\\radhi\\OneDrive\\Desktop\\Pictures1.jpeg");
		//step4
		FileHandler.copy(src,dst);

	}

}
