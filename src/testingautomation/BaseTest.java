package testingautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// to read the data from excel file
public class BaseTest
{
	
	/*public static void main(String[] args) throws Exception 
	{
		File file=new File("data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sh=  wb.getSheet("Sheet1");
		Row r= sh.getRow(2);
		Cell c=  r.getCell(1);
		
		String data= c.toString();
		System.out.println(data);*/
		
	/*public static void main(String[] args) throws Exception 
	{
		File file=new File("data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sh=  wb.getSheet("Sheet1");
		int rc=sh.getLastRowNum();
		System.out.println(rc);*/
		
	public static void main(String[] args) throws Exception 
	{
		File file=new File("data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sh=  wb.getSheet("Sheet1");
		Row r= sh.getRow(5);
		
		int cc=r.getLastCellNum();
		System.out.println(cc);
		
		
		
		
	}
	

}
