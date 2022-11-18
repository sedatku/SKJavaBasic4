package com.neotech.lesson26;

public class WebDriverTest {
	public static void main(String[] args) {
		RemoteWebDriver d1 = new ChromeDriver();
		RemoteWebDriver d2 = new FirefoxDriver();
		RemoteWebDriver d3 = new SafariDriver();
		
		RemoteWebDriver [] webArray = {d1, d2, d3};
		
		for(RemoteWebDriver el: webArray) {
			el.open();
			el.close();
			el.navigate();
			el.getScreenshot();
			System.out.println(el.getTitle());
			System.out.println("======================");
		}
	}
}
