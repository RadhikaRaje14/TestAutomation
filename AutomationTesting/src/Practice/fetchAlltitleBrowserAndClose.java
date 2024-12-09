package Practice;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchAlltitleBrowserAndClose
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> allwh=driver.getWindowHandles();//get all window handles
		for(String wh:allwh)
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
