package com.neotech.lesson25;
//Homework 1:
//    Create a WebDriver Interface that will have the following unimplemented behaviour: 
//	   openBrowser(), 
//	   closeBrowser(), 
//	   maximizeWindow(), 
//	   findElement(). 
//
//    Create another interface named Camera that will have the method:
//	   takePicture();
//    Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.


public interface WebDriver {
	
	public abstract void openBrowser();
	public abstract void closeBrowser();
	public abstract void maximizeWindow();
	public abstract void findElement();
}
interface Camera{
	public abstract void takePicture();
}


