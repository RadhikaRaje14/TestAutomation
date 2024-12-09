package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathfblogin {

	public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.facbook.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("Radhika");
				driver.findElement(By.xpath("//input[@ id='pass']")).sendKeys("Radhika123");
				driver.findElement(By.xpath("//button[@ name='login']")).click();
			}
		}

