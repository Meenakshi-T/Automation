
package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demoabc 
{
	public static void main(String[] args) throws Exception 
	{
		File file=new File("data/input.xlsx");
		FileInputStream f = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(f);
		
		Sheet sh=  wb.getSheet("Sheet1");
		int rc=sh.getLastRowNum();
		for(int i=0;i<=rc;i++)
		{
			Row r=sh.getRow(i);
			int cc=r.getLastCellNum();
			for(int j=0; j<cc; j++)
			{
				Row row=sh.getRow(i);
			Cell cell=row.getCell(j);
			String data=cell.toString();
			
			System.out.print(data+"\t");
			}
			System.out.println();
		}
		
	}

}
