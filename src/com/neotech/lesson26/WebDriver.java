package com.neotech.lesson26;

public interface WebDriver  {
	void open();
	void close();
	String getTitle();
}
interface TakesScreenShots{
	void getScreenshot();
}
interface RemoteWebDriver extends TakesScreenShots, WebDriver{
	void navigate();
}