package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locationELe {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//a[text()='मराठी']"));
		Point p=ele.getLocation();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		driver.quit();

	}

}
