package com.neotech.lesson26;

//Homework 1:
//Create a WebDriver Interface that will have the following unimplemented behaviour: 
// openBrowser(), 
// closeBrowser(), 
// maximizeWindow(), 
// findElement(). 
//
//Create another interface named Camera that will have the method:
// takePicture();
//Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.



public interface WebDriver1 {
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();	
}

interface Camera1{
	void takePicture();	
}

class ChromeDriver1 implements WebDriver1, Camera1{
	String Driver = "ChromeDriver";
	@Override
	public void takePicture() {
		System.out.println("Take picture using " + Driver);
	}

	@Override
	public void openBrowser() {
		System.out.println("Open the browser using " + Driver);
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the browser using " + Driver);
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window using " + Driver);
	}

	@Override
	public void findElement() {
		System.out.println("Find a element using " + Driver);
	}
}

class FirefoxDriver1 implements WebDriver1, Camera1{
	String Driver = "FireFox";
	@Override
	public void takePicture() {
		System.out.println("Take picture using " + Driver);
	}

	@Override
	public void openBrowser() {
		System.out.println("Open the browser using " + Driver);
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close the browser using " + Driver);
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window using " + Driver);
	}

	@Override
	public void findElement() {
		System.out.println("Find a element using " + Driver);
	}
}
