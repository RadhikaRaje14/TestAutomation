package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passDataRefresh {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("email"));
				ele.sendKeys("Rajshree");
				driver.navigate().refresh();
				ele.sendKeys("Radhika");
		

	}

}
