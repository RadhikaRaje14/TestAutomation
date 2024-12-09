package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEle2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/Locat.html");
		Thread.sleep(2000);
		driver.findElement(By.className("n1")).click();
	

	}

}
