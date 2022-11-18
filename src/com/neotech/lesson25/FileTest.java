package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {
		//File f1 = new File();

		File java = new JavaFile();
		//java.open();
		File pdf = new PdfFile();
	//	pdf.open();
		
		//1st way
		File[] files = {java, pdf};
		
		//2nd way 
		File[] fileArray = {new JavaFile(), new PdfFile(), new WordFile(), new JavaFile()};
		
		for (File f: fileArray) {
			//I am able to open different file because of abstract method
			f.open();
			f.close();
			
		}

	}

}
