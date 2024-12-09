package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
