package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartMob {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(15000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@ data-id='MOBH2Q4PN6FWZCGV']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[@class='col col-6-12 flex']")).click();
	}

}
