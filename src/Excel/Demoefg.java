package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demoefg 
{
	public static void main(String[] args) throws Exception 
	{
		File file=new File("data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sh=  wb.getSheet("Sheet1");
		sh.createRow(28).createCell(2).setCellValue("meena");
		FileOutputStream fos= new FileOutputStream(file);
		wb.write(fos);
		
		
		
		
	}
	

}
