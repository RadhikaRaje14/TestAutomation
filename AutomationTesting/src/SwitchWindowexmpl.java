import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//switch back 4th window
public class SwitchWindowexmpl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("NewTab")).click();
		String mainwindow=driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(mainwindow))
			{
				driver.switchTo().window(handle);//switch to the new tab
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				
				driver.switchTo().window(mainwindow);//switch back to the main window
			}
		}
	//	driver.quit();
		

	}

}
