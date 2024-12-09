package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopUpAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");//open main url
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("Raj");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		a.accept();
	
	}
}