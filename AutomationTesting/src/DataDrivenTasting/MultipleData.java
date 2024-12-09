package DataDrivenTasting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData
{

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream fis=new FileInputStream("./Testdata/facebookCredential.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for(int i=0;i<lr;i++)
		{
			XSSFRow row=sheet.getRow(i);//0
			XSSFCell cel1=row.getCell(0);//0
			String c1va1=cel1.getStringCellValue();
			XSSFCell cel2=row.getCell(2);
			String c2va2=cel2.getStringCellValue();
			System.out.println(c1va1+" "+" "+c2va2);
		}
		book.close();
		fis.close();

	}
}

