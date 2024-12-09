package Sychronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStartReset 
{
	public static void main(String[] args) 
	{

	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
	WebDriverWait wait=new WebDriverWait(driver,50);
	
	WebElement ele=driver.findElement(By.xpath("//button[text()='Start']"));
	ele.click();
	wait.until(ExpectedConditions.visibilityOf(ele));
	
	WebElement ele1=driver.findElement(By.xpath("//button[text()='Reset']"));
	ele1.click();
	wait.until(ExpectedConditions.visibilityOf(ele1));
	//driver.quit();
	
	}

}
