package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseDedicatedTab {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String p_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			
			if(title.equals("Browser Window"));  
			{
				driver.close();
			}

	}

}
}