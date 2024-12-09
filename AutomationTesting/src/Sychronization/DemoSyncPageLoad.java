package Sychronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSyncPageLoad {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/pageLoad");
		
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		String p_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		allwh.remove(p_id);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			driver.findElement(By.id("email")).sendKeys("Rajshree");
			driver.findElement(By.xpath("//button[text()='Subscribe']")).click();
			driver.quit();
	}
	}

}
