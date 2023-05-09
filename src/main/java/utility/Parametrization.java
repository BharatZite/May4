package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String GetExcelData(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Bharat\\Documents\\eclipse\\automation\\src\\May4\\src\\test\\resources\\Credentials.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
	
}
