package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchAttrValue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='मराठी']"));
		
		String title=ele.getAttribute("title");
		System.out.println(title);
		driver.quit();
	}

	}

