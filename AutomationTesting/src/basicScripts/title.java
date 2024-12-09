package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//String src=driver.getPageSource();
		Thread.sleep(2000);
		//driver.close();
}
}