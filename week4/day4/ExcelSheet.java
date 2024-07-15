package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        XSSFWorkbook workbook = new XSSFWorkbook("./data/CreateIndividuals.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFSheet sheetName = workbook.getSheet("Sheet1");
        int rowCount = sheet.getLastRowNum();
        System.out.println("The row count is "+rowCount);
        short columnCount = sheet.getRow(1).getLastCellNum();
        System.out.println("The column count is "+columnCount);
        String CellValue = sheet.getRow(1).getCell(2).getStringCellValue();
        System.out.println("The value at 1st row and 3rd column is "+CellValue);
        //To iterate for ever values
        for (int i = 1; i <= rowCount; i++) 
        {
        	for (int j = 0; j < columnCount; j++) 
        	{
        		String CellValues = sheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.println(CellValues);
				
			}
			
		}
        workbook.close();
	}

}
