package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementqspider {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		WebElement ele=driver.findElement(By.id("domain1"));
		Thread.sleep(1000);
		
	boolean b= ele.isSelected();
	if(b)
	{
		System.out.println("Is Selected");
	}
	else
	{
		System.out.println("Not seleted");
	}
	}

}
