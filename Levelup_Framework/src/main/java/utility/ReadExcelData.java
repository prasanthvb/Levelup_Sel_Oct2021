package utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] getData(String fileName) throws IOException {
		
		//Locate Workbook
		XSSFWorkbook wbook = new XSSFWorkbook("./resources/" + fileName + ".xlsx");
		
		// Locate Sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("no. of rows : " + lastRowNum);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("no. of all rows : " + physicalNumberOfRows);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("no. of columns : " + lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			// First Row
			XSSFRow row = sheet.getRow(i);
			//get the cell value 
			for (int j = 0; j < lastCellNum; j++) {
				// First Column
				XSSFCell cell = row.getCell(j);
				//String value = cell.getStringCellValue();
				 DataFormatter dft= new DataFormatter();
				 String value = dft.formatCellValue(cell);
						 
				System.out.println(value);
				
				data[i-1][j]= value;
			} 
		}
		
		
		wbook.close();
		return data;

	}

}
