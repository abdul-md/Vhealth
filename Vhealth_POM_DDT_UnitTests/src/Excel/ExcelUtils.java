package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try 
		{
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try
		{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
  
		} 
		catch (Exception e) 
		{
			return "";
		}

	}
	
	
	// This method is to read the numeric test data from the Excel cell, in this we are
		// passing parameters as Row num and Col num
	public static double getNumericCellData(int RowNum, int ColNum) throws Exception {

		try
		{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			double NumericCellData = Cell.getNumericCellValue();
			return NumericCellData;
  
		} 
		catch (Exception e) 
		{
			return 0;
		}

	}
	
	
	// This method is to write the test results to Excel sheet, in this we are
	// passing parameters as Row num and Col num
	public static void colors(int RowNum, int ColNum)
	{
		
		try
		{
			//Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//			double NumericCellData = Cell.getNumericCellValue();
//			return NumericCellData;
  
			// setting the background color
//			CellStyle style = ExcelWBook.createCellStyle();
//			style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
//
//			// setting the font color
//			Font font = ExcelWBook.createFont();
//			font.setColor(IndexedColors.RED.getIndex());
//			style.setFont(font);
//
//			// creating the cell
//			Row =  ExcelWSheet.createRow(RowNum);
//			XSSFCell cell2 = Row.createCell(ColNum);
//			cell2.setCellValue("Pass");
//			cell2.setCellStyle(style);

			ExcelWSheet.getRow(0).createCell(2).setCellValue("Passs");
			
			
			// write into the cell
			FileOutputStream fo = new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
			ExcelWBook.write(fo);
			fo.close();
			ExcelWBook.close();
			System.out.println("Done");			
			
		} 
		catch (Exception e) 
		{
			//return 0;
		}
		
		
	}
	
	
	
	
	
	
	
	// This method is to write the test results to Excel sheet, in this we are
	// passing parameters as Row num and Col num
	public static void colors_2(int RowNum_1, int ColNum_1)
	{
		
		try
		{

//			   Workbook workbook = new XSSFWorkbook();
//			    Sheet sheet = workbook.createSheet("Color Test");

			    CellStyle style = ExcelWBook.createCellStyle();
			    org.apache.poi.ss.usermodel.Row row = ExcelWSheet.getRow(RowNum_1);
			    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			    style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
//			    style.setFillPattern(FillPatternType.BIG_SPOTS);
			    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			    
			    Font font = ExcelWBook.createFont();
			    font.setColor(IndexedColors.WHITE.getIndex());
//		        font.setColor(IndexedColors.RED.getIndex());
		        style.setFont(font);
		        
			    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
			    cell1.setCellValue("PASS");
			    cell1.setCellStyle(style);
			    
//			    org.apache.poi.ss.usermodel.Cell cell2 = row.createCell(1);
//			    cell2.setCellValue("NAME");
//			    cell2.setCellStyle(style);
			 
			    
			    FileOutputStream fos =new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
			    ExcelWBook.write(fos);
			    fos.close();
			    System.out.println("Done");			
		} 
		catch (Exception e) 
		{
			//return 0;
		}

	}
	
	
	// This method is to write the test results to Excel sheet, in this we are
		// passing parameters as Row num and Col num
		public static void colors_3(int RowNum_1, int ColNum_1)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = ExcelWBook.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = ExcelWSheet.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
//				    Font font = ExcelWBook.createFont();
//				    font.setColor(IndexedColors.WHITE.getIndex());
//			        style.setFont(font);
			      
			    //exp    
			        XSSFFont defaultFont= ExcelWBook.createFont();
			        defaultFont.setFontHeightInPoints((short)10);
			        defaultFont.setFontName("Arial");
			        defaultFont.setColor(IndexedColors.BLACK.getIndex());
			        defaultFont.setBold(false);
			        defaultFont.setItalic(false);
			        
			        XSSFFont font= ExcelWBook.createFont();
			        font.setFontHeightInPoints((short)10);
			        font.setFontName("Arial");
			        font.setColor(IndexedColors.WHITE.getIndex());
			        font.setBold(true);
			        font.setItalic(false);

			        style=row.getRowStyle();
//			        style.setFillBackgroundColor(IndexedColors.DARK_BLUE.getIndex());
//			        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//			        style.setAlignment(FillPatternType.ALIGN_CENTER);
			        style.setFont(font);
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue("PASS");
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
				    ExcelWBook.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
		
		
		public static void onTestPASS_colorGreen(int RowNum_1, int ColNum_1)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = ExcelWBook.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = ExcelWSheet.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
				    Font font = ExcelWBook.createFont();
				    font.setColor(IndexedColors.WHITE.getIndex());
			        style.setFont(font);
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue("PASS");
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
				    ExcelWBook.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
	

		
		public static void onTestFail_colorRED(int RowNum_1, int ColNum_1)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = ExcelWBook.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = ExcelWSheet.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.RED.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
				    Font font = ExcelWBook.createFont();
				    font.setColor(IndexedColors.YELLOW.getIndex());
			        style.setFont(font);
			      
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue("PASS");
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
				    ExcelWBook.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}

	
}