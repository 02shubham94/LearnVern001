package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Configuration.PathFiles;

public class UtilityClass {
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
	public static void main(String[] args) throws IOException {
		UtilityClass a = new UtilityClass();
		a.getCellData(1, 1);
	}
}