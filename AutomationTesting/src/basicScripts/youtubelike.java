package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubelike {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/watch?v=qR20KF7wxSU&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR");
	Thread.sleep(1500);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[]")).click();	}
}
