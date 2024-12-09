package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathyahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.intl=in");
		Thread.sleep(2000);
		//driver().manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("radhika");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("radhika123");
		driver.findElement(By.xpath("//select[@name='mm']\r\n")).sendKeys("radhika123");
		
		


	}

}
