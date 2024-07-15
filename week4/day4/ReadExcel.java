package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelData() throws IOException 
	{
		XSSFWorkbook workbook = new XSSFWorkbook("./data/CreateIndividuals.xlsx");
		//To get sheet by index
		XSSFSheet sheet = workbook.getSheetAt(1);
		//To get sheet by name
		XSSFSheet sheetName = workbook.getSheet("Sheet2");
		//To get the row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("The row count is "+rowCount);
		//To get the column count
		short columnCount = sheet.getRow(1).getLastCellNum();
		System.out.println("The column count is "+columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		//to iterate for all the values
		for (int i = 1; i <= rowCount; i++) 
		{
			for (int j = 0; j < columnCount; j++) 
			{
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
				
			}
			
		}
        return data;
	}

}
