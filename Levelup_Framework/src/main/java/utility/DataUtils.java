package utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider(name = "login")
	public String[][] getdata() {
		String[][] excelData = null;
		try {
			excelData = ReadExcel.getData();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
//		//row 1
//		data[0][0] = "Hari";
//		data[0][1] = "hari123";
//		
//		
//		//row2
//		data[1][0] = "Santosh";
//		data[1][1] = "san123";
		
		return excelData;
	}
	
}
