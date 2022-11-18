package com.neotech.lesson26;

public class ChromeDriver implements RemoteWebDriver{
	String driver = "Chrome";
	String title = "Main Page - from Chrome";

	@Override
	public void open() {
		System.out.println("Open the browser using " + driver);
	}

	@Override
	public void close() {
		System.out.println("Close the browser using " + driver);
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void navigate() {
		System.out.println("Navigate the browser using " + driver);
	}
	
	@Override
	public void getScreenshot() {
		System.out.println("Getting a screenshot using " + driver);
	}	
}