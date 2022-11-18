package com.neotech.lesson25;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver c = new ChromeDriver();
		c.openBrowser();
		c.closeBrowser();
		c.maximizeWindow();
		c.findElement();
		
		Camera c1 = new ChromeDriver();
		c1.takePicture();
		
		System.out.println("=================");
		
		WebDriver ff = new FirefoxDriver();
		ff.openBrowser();
		ff.closeBrowser();
		ff.maximizeWindow();
		ff.findElement();
		Camera ff1 = new FirefoxDriver();
		ff1.takePicture();
		
		
	}

}
