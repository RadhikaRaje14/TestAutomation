package DataDrivenTasting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleData 
{
	public static void main(String[] args) throws IOException 
	{		
	FileInputStream fis=new FileInputStream("./Testdata/facebookCredential.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(2);
	XSSFCell cell=row.getCell(0);
	String val=cell.getStringCellValue();
	System.out.println(val);
	workbook.close();
	fis.close();
	}

}
