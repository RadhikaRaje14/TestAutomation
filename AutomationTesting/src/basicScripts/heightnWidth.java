package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class heightnWidth {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
		int h=ele.getSize().getHeight();
		System.out.println(h);
		int w=ele.getSize().getWidth();
		System.out.println(w);
		driver.quit();
	}

}
