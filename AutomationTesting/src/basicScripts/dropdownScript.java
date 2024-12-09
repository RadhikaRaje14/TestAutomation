package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
	
		WebElement ele=driver.findElement(By.id("select3"));
		Select s=new Select(ele);
		s.selectByValue("Canada");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[.='Multi Select']"));
		Thread.sleep(2000);
		//driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		
		//locate multiselect dropdown
		WebElement ele1=driver.findElement(By.xpath("//a[text()='Multi Select']"));
		Thread.sleep(1000);
		Select s1=new Select(ele1);
		if(s1.isMultiple())
		{
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		
		//s1.deselectByVisibleText("Add");
		//s1.deselectByIndex(1);
		//s1.deselectAll();
		
		System.out.println("Multiple selected");
		}
		else
		{
			System.out.println("not multiselect");
		}

		//s1.selectByVisibleText("Add All");
		driver.close();

	}

}
