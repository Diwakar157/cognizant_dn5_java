package com.cognizant.factorymethod;

public class ExcelDocument implements Document {

	 @Override
	    public void open() {
	        System.out.println("Excel spreadsheet is now open.");
	    }
}
