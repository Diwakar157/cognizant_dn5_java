package com.cognizant.factorymethod;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Pdf is now open.");
    }
}
