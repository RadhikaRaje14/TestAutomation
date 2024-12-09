package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class oddEvenDropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("");
		WebElement ele=driver.findElement(By.id("Nandanas"));
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
	
		for(int i=0;i<6;i++);
		int i;
		s.selectByIndex(i);
		
		System.out.println("even option"+opt.get(i).getText());
		
		s.deselectAll();
		
		for(int i1=6;i1>=0;i1--)
		{
			s.selectByIndex(i1);
			System.out.println("odd rev"+ s.g);
		}

}
}
