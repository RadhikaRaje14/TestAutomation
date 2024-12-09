package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qspiderdemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ id='name']")).sendKeys("Rajshree");
		driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("Rajshree@gmail.com");
		driver.findElement(By.xpath("//input[@ id='password']")).sendKeys("Rajshree");
		
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		driver.findElement(By.xpath("//button[@id='btn3']")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attended']")).click();
		

		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		

		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/main/section/article/aside/div/aside/div/div[2]/section[1]/aside[1]/article[2]/label/span/span")).click();
		
		
		driver.close();
		
		}

	
}
