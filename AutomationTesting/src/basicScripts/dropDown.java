package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(1000);
	driver.get("file:///C:/Users/radhi/OneDrive/Desktop/HTML/Dropdown.html");
	WebElement ele=driver.findElement(By.id("Nandanas"));
	Select s=new Select(ele);
	s.selectByIndex(1);
	Thread.sleep(1000);
	s.selectByValue("l");
	Thread.sleep(1000);
	s.deselectByValue("l");
	driver.close();
	

	}

}
