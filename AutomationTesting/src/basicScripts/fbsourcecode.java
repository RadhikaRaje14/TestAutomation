package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//check the title matching or not using equal()

//webdriver()gettitle

public class fbsourcecode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		if(title.equals("Hello Facebook"))
		{
			System.out.println("Title is matching");
		}
		else 
			if(title.contains("Facebook"))
		{
			System.out.println("Title partially matching");
		}
		Thread.sleep(1000);
	}

}
