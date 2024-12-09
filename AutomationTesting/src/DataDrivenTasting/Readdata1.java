package DataDrivenTasting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readdata1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		FileInputStream fis=new FileInputStream("./Testdata/facebookCredential.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cell=row.getCell(0);
		String val=cell.getStringCellValue();
		System.out.println(val);
		
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys(val);
		WebElement ele1=driver.findElement(By.id("pass"));
		ele1.sendKeys(val);
		driver.findElement(By.id("u_0_5_2B")).click();
		
		
		driver.quit();
		
	}

}
