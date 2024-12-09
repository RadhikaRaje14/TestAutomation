package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathGoogleMap {

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/maps/@13.0399315,77.5103334,14z?entry=ttu&g_ep=EgoyMDI0MTAwOS4wIKXMDSoASAFQAw%3D%3D");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@ id='searchboxinput']")).clear();
			driver.findElement(By.xpath("//span[@  class='google-symbols NhBTye G47vBd']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='sb_ifc50']/input")).sendKeys("Mysore,Karnataka");
			driver.findElement(By.xpath("//*[@id='sb_ifc51']/input")).sendKeys("Bengluru,Karnataka");
	}
	}
}
