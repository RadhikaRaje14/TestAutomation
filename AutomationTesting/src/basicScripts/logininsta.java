package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logininsta 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Arya");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("_acan _acap _acas _aj1- _ap30")).click();
	}

}
