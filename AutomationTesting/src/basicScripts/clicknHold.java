package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clicknHold {

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0&scenario=1");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement click=driver.findElement(By.id("circle"));

			Actions act=new Actions(driver);
			act.clickAndHold(click).perform();


	}

}
