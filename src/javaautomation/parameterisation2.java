package javaautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parameterisation2 {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\VinayakPc\\Desktop\\yogesh\\Details.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file1);
		
		XSSFSheet s = book.getSheet("Sheet1");
		
		int rowsize = s.getLastRowNum()+1;
		int cellsize = s.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<cellsize;j++)
			{	
				CellType type = s.getRow(i).getCell(j).getCellType();
				if(type==CellType.STRING)
				{
					System.out.print(s.getRow(i).getCell(j).getStringCellValue()+"   ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(s.getRow(i).getCell(j).getNumericCellValue()+"   ");
				}
				else
				{
					System.out.print(s.getRow(i).getCell(j).getBooleanCellValue()+"   ");
				}
			}
			System.out.println();	
		}

	}

}
