package com.neotech.lesson25;

public class FirefoxDriver implements WebDriver, Camera {
	
	@Override
	public void openBrowser() {
		System.out.println("Please click the button for open the Firefox browser");	
	}

	@Override
	public void closeBrowser() {
		System.out.println("Please click the button for close the Firefox browser");	
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Please click the button for maximize window the Firefox browser");	
	}

	@Override
	public void findElement() {
		System.out.println("Please click the search button for find element in the Firefox browser");	
	}
	
	@Override
	public void takePicture() {
		System.out.println("Please click camera button for use the webcam in the the Firefox browser");
		
	}
}
