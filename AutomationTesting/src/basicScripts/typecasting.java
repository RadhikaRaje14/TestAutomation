package basicScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class typecasting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		
		List<WebElement> opt=s.getOptions();
		TreeSet<String> l=new TreeSet<String>();
		
		for(WebElement we:opt)
		{
			String t=we.getText();
			l.add(t);
		}
		
		ArrayList<String> t=new ArrayList<String> (l);
		System.out.println(t);

	}

}
