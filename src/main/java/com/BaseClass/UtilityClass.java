package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Configuration.PathFiles;

public class UtilityClass {
	WebDriver cdriver;
	ChromeBaseClass base;
	String path = PathFiles.Excelpath;
	FileInputStream stream;
	Workbook book;
	Sheet sheet;
	Row row;
	Cell cell;
	
	public String getCellData(int rownum, int celnum) throws IOException {
		stream = new FileInputStream(path);
		book = WorkbookFactory.create(stream);
		sheet = book.getSheet("LearnData");
		row = sheet.getRow(rownum);
		cell = row.getCell(celnum);
		
		DataFormatter format = new DataFormatter();
		String data;
		try {
			data = format.formatCellValue(cell);
		}catch(Exception e){
			data = "";
		}
		return data;
	}
	public void takeScreenshot(String tcID, WebDriver cdriver) throws IOException {
		Date d = new Date();
		String date = d.toString();
		String rep = date.replace(":", "_");
		File src = ((TakesScreenshot)cdriver).getScreenshotAs(OutputType.FILE);
		File dest = new File(PathFiles.ScreenshotPathpath+"_"+tcID+"_"+rep+".jpg");
//		FileHandler.copy(src, dest);
		FileUtils.copyFile(src, dest);
	}
}