package HandlingPopup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchAddParentBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		
		/*String driver1=driver.getWindowHandle();
		System.out.println(driver1);*/
		

		Set<String> allwh=driver.getWindowHandles();
		System.out.println(allwh.size());
		for(String wh: allwh)
		{
		System.out.println(wh);
		}
	}

}
