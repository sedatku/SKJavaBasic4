package com.neotech.lesson26;

public class WebDriverTest1 {

	public static void main(String[] args) {
		
		ChromeDriver1 chrome = new ChromeDriver1();
		chrome.openBrowser();
		chrome.closeBrowser();
		chrome.maximizeWindow();
		chrome.findElement();
		chrome.takePicture();
		chrome.closeBrowser();
		
		
		System.out.println("=================================");
		
		FirefoxDriver1 firefox = new FirefoxDriver1();
		firefox.openBrowser();
		firefox.closeBrowser();
		firefox.maximizeWindow();
		firefox.findElement();
		firefox.takePicture();
		firefox.closeBrowser();
		
		System.out.println("=================================");
		
		WebDriver1 wb = new ChromeDriver1();
		//wb.takePicture(); //cannot access it
		wb.openBrowser();

	}

}
