package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class backForwardrefresh {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.navigate().to("https://www.google.co.in/");
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.navigate().refresh();
	//Dimention d=new Dimention();
	//driver.manage().wait().setsize(d);
	driver.quit();
	
	

	}

}
