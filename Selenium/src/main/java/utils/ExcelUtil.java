package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	String path;
	FileInputStream fis;
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	
	public ExcelUtil(String path) {
		this.path = path;
	}
	
	
	private XSSFSheet getSheet(String sheetname) throws IOException {
		File file = new File(path);
		fis = new FileInputStream(file);
		workBook = new XSSFWorkbook(fis);
		sheet = workBook.getSheet(sheetname);
		return sheet;
	}


	public String getData(String sheetName, int rowNumber, int columnNumber) throws IOException {
		Row row = getSheet(sheetName).getRow(rowNumber);
		Cell column = row.getCell(columnNumber);
		String cellValue = column.getStringCellValue();
		workBook.close();
		fis.close();
		return cellValue;
	}
	
	
	public int getLastRow(String sheetName) throws IOException {
		return getSheet(sheetName).getLastRowNum();
	}
}
