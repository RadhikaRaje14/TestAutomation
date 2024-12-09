package Sychronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("login-username")).sendKeys("rajshreerk14@yahoo.com");
	
		driver.findElement(By.id("login-signin")).click();
		
		
		
		driver.findElement(By.id("login-passwd")).sendKeys("housequeen14radha");
		driver.findElement(By.id("login-signin")).click();
	

	}

}
