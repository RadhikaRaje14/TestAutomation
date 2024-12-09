package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script12 {

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./Softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		

		String key1="webdriver.chrome.driver";
		String value2="./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver1=new ChromeDriver();
	}

}
