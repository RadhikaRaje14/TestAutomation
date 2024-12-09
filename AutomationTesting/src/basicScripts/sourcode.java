package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sourcode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		String src=driver.getPageSource();
		System.out.println(src);

	}

}
