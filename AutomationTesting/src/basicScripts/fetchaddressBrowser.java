package basicScripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchaddressBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String driver1=driver.getWindowHandle();
		System.out.println(driver1);
		Thread.sleep(2000);
		Set<String> wind=driver.getWindowHandles();	
		System.out.println(wind);

	}

}
