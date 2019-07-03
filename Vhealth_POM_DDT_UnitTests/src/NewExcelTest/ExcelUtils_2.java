package NewExcelTest;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import SetUp.LaunchSetup;


public class ExcelUtils_2 extends LaunchSetup
{
	private static XSSFWorkbook wb;
	protected static XSSFSheet sh;
	private static XSSFRow Row;
	private static XSSFCell Cell;

	// This method is to set the File path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try 
		{
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			
			// Access the required test data sheet
			wb = new XSSFWorkbook(ExcelFile);
			sh = wb.getSheet(SheetName);

		} catch (Exception e) {

			throw (e);

		}

	}
	
	
	//method to count the row 
    public static int getRowCount(int sheetNumber)
    {
        
    int rowcounts=wb.getSheetAt(sheetNumber).getLastRowNum();
    
    int rowcount=rowcounts+1;
    
    return rowcount;
    
    }
    

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try
		{
			Cell = sh.getRow(RowNum).getCell(ColNum);
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
			Cell = sh.getRow(RowNum).getCell(ColNum);
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
			//Cell = sh.getRow(RowNum).getCell(ColNum);
//			double NumericCellData = Cell.getNumericCellValue();
//			return NumericCellData;
  
			// setting the background color
//			CellStyle style = wb.createCellStyle();
//			style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
//
//			// setting the font color
//			Font font = wb.createFont();
//			font.setColor(IndexedColors.RED.getIndex());
//			style.setFont(font);
//
//			// creating the cell
//			Row =  sh.createRow(RowNum);
//			XSSFCell cell2 = Row.createCell(ColNum);
//			cell2.setCellValue("Pass");
//			cell2.setCellStyle(style);

			sh.getRow(0).createCell(2).setCellValue("Passs");
			
			
			// write into the cell
			FileOutputStream fo = new FileOutputStream("C:/Users/Ahad/Desktop/TestData_1.xlsx");
			wb.write(fo);
			fo.close();
			wb.close();
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

			    CellStyle style = wb.createCellStyle();
			    org.apache.poi.ss.usermodel.Row row = sh.getRow(RowNum_1);
			    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			    style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
//			    style.setFillPattern(FillPatternType.BIG_SPOTS);
			    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			    
			    Font font = wb.createFont();
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
			    wb.write(fos);
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
				    CellStyle style = wb.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = sh.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
//				    Font font = wb.createFont();
//				    font.setColor(IndexedColors.WHITE.getIndex());
//			        style.setFont(font);
			      
			    //exp    
			        XSSFFont defaultFont= wb.createFont();
			        defaultFont.setFontHeightInPoints((short)10);
			        defaultFont.setFontName("Arial");
			        defaultFont.setColor(IndexedColors.BLACK.getIndex());
			        defaultFont.setBold(false);
			        defaultFont.setItalic(false);
			        
			        XSSFFont font= wb.createFont();
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
				    wb.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
		
		
		public static void onTestPASS_colorGreen(int RowNum_1, int ColNum_1,  String excelFileName_Towrite)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = wb.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = sh.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
				    Font font = wb.createFont();
				    font.setColor(IndexedColors.WHITE.getIndex());
			        style.setFont(font);
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue("PASS");
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream(excelFileName_Towrite);
				    wb.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
	

		
		public static void onTestFail_colorRed(int RowNum_1, int ColNum_1, String excelFileName_Towrite)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = wb.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = sh.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.RED.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
				    Font font = wb.createFont();
				    font.setColor(IndexedColors.YELLOW.getIndex());
			        style.setFont(font);
			      
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue("FAIL");
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream(excelFileName_Towrite);
				    wb.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
		
		
		public static void colorcodingRed_withMesg(String excelFileName_Towrite, int RowNum_1, int ColNum_1, String message_to_write_in_excel)
		{			
			try
			{

				//cell color - background color
				    CellStyle style = wb.createCellStyle();
				    org.apache.poi.ss.usermodel.Row row = sh.getRow(RowNum_1);
				    style.setFillForegroundColor(IndexedColors.RED.getIndex());
				    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

				  //font color
				    Font font = wb.createFont();
				    font.setColor(IndexedColors.YELLOW.getIndex());
			        style.setFont(font);
			      
			        
				    org.apache.poi.ss.usermodel.Cell cell1 = row.createCell(ColNum_1);
				    cell1.setCellValue(message_to_write_in_excel);
				    cell1.setCellStyle(style);
				  
				    
				    FileOutputStream fos =new FileOutputStream(excelFileName_Towrite);
				    wb.write(fos);
				    fos.close();
				    System.out.println("Done");			
			} 
			catch (Exception e) 
			{
				//return 0;
			}

		}
		
		
		
		
		public static void writeData(String output_filePath,int row, int cell, String write_str_msg_1) throws IOException
		{
				Row=sh.getRow(row);
			 	Cell = Row.createCell(cell);
			    Cell.setCellValue(write_str_msg_1);
//			    cell1.setCellStyle(style);


			    FileOutputStream fos =new FileOutputStream(output_filePath);
			    wb.write(fos);
			    fos.close();
//			    System.out.println("Done");
			
			
		}
		
	
}