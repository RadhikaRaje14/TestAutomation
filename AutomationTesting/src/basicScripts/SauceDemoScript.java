package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceDemoScript 
{
	public static void main(String[] args) throws InterruptedException 

			{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			WebElement ele=driver.findElement(By.xpath("//img[@class='inventory_item_img']"));
			ele.click();
			
			WebElement ele1=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			String title=ele1.getText();
			System.out.println(title);
			
			WebElement ele2=driver.findElement(By.xpath("//div[text()='29.99']"));
			String price=ele2.getText();
			System.out.println(price);
			
			WebElement ele3=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
			ele3.click();
			
			WebElement ele4=driver.findElement(By.id("shopping_cart_container"));
			ele4.click();	
			
			WebElement ele5=driver.findElement(By.id("item_4_title_link"));
			String title1=ele5.getText();
			System.out.println(title1);
			
			
			WebElement ele6=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
			String price1=ele6.getText();
			System.out.println(price1);
			
			if(title==title1)
			{
				System.out.println("Title is matching");
			}
			else if (price==price1)
			{
				System.out.println("Price is matching");
			}
			else
			{
				System.out.println("Title and Price is not matching");
			}
			
	
		   driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		   Thread.sleep(1000);
		   
		   driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
