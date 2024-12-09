package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebeleAllMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement ele=driver.findElement(By.xpath("//section[text()='Text Field']"));
		String text=ele.getText();
		System.out.println(text);

		WebElement ele1=driver.findElement(By.xpath("//input[@id='name']"));
		String title=ele1.getAttribute("title");
		System.out.println(title);
		
		WebElement ele2=driver.findElement(By.xpath("//input[@id='name']"));
		Point p=ele2.getLocation();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		WebElement ele3=driver.findElement(By.id("email"));
		String fsize=ele3.getCssValue("font-size");
		System.out.println(fsize);
		
		WebElement ele4=driver.findElement(By.xpath("//input[@type='email']"));
		int h=ele4.getSize().getHeight();
		System.out.println(h);
		
		int w=ele4.getSize().getWidth();
		System.out.println(w);
		
		
		//enter the url without get()
		driver.navigate().to("https://www.facebook.com/");
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

	
}
