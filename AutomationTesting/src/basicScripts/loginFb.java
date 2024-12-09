package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginFb 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facbook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Rajshree");
		driver.findElement(By.name("pass")).sendKeys("Radhika123");
		driver.findElement(By.name("login")).click();
	}
}
