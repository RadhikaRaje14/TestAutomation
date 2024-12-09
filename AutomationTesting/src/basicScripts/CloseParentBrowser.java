package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseParentBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		String p_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh)//switching between window
		{
			driver.switchTo().window(wh);//it switch to the window 'wh'
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			
			if(wh.equals(p_id))//it current wh match the parent window it close
			{
				driver.close();
			}
		}
	}

}
