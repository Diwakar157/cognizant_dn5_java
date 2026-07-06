package com.cognizant.factorymethod;

public class WordDocument implements Document {
	
	@Override
    public void open() {
        System.out.println("Word document is now open.");
	}
}
