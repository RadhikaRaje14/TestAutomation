package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//to fetch the count of no of years

public class countNoYr {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.id("year"));
		Select s=new Select(ele);
		List<WebElement> opt=s.getOptions();
		System.out.println(opt.size());
	}

}
