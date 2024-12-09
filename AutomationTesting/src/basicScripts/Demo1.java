package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
//was to fetch the title,URL,Sourcecode of fb page
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String src=driver.getPageSource();
	System.out.println(src);
	
	driver.close();	}

}
