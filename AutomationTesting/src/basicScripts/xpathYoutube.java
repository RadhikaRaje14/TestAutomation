package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathYoutube 
{
	public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.youtube.com/watch?v=cobEbkTwbwY");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[@ id='video-title']")).sendKeys("Selenium");
				driver.findElement(By.xpath("//a[@ class='yt-simple-endpoint style-scope ytd-video-renderer']]")).click();
				driver.findElement(By.xpath("//a[@ title=What is Selenium | Selenium Explained in 2-minutes | Introduction to Selenium | Intellipaat']")).click();
			}

		}



