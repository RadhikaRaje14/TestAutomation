package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class apiJavaxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/javascript/index.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='JavaScript']/../p[4]")).click();
		driver.quit();
	}

}
