package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubejeev {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/results?search_query=jeevlaga");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("yt-icon[id='video-title']")).sendKeys("Jeevlaga title song");
		driver.findElement(By.cssSelector("a[class='style-scope ytd-playlist-renderer']")).click();
		
	}

}
