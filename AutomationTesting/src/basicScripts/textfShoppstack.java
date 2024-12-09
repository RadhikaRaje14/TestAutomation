package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textfShoppstack 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://shoppersstack.com");
		Thread.sleep(15000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='men']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='Men Viscose Rayon Kurta Churidar Set']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='buy now']")).click();
		//Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Rajshree@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("raj123");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
