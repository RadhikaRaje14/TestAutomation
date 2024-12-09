package basicScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fetchnumexcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/sendto.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(1);
		String val=cell.toString();//to fetch number we use tostring()
		System.out.println(val);
		workbook.close();
		fis.close();

	}

}
