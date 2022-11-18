package com.neotech.lesson27;

interface WebDriver {

	void open(); // by default public & abstract

	void close();

	String getTitle();

}

interface TakesScreenShot {

	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {
	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened");

	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screeshot taken from Chrome");

	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Chrome");

	}

}


class FireFoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Firefox driver opened");

	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screeshot taken from Firefox");

	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Firefox");

	}
	
}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened");

	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");

	}

	@Override
	public String getTitle() {
		return "Neotech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Safari taken from Firefox");

	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Safari");

	}
	
}






public class Homework2 {
	
	public static void main(String[] args) {
		//You can not create an object from an interface
		//RemoteWebDriver rwd = new RemoteWebDriver();
		
		
		ChromeDriver c = new ChromeDriver();
		c.open();
		
		FireFoxDriver f = new FireFoxDriver();
		f.open();
		
		SafariDriver s = new SafariDriver();
		
		System.out.println("---Upcasting---");
		RemoteWebDriver rwd1 = c; //up-casting
		rwd1.open();
		RemoteWebDriver rwd2 = f; //up-casting
		rwd2.open();
		
		System.out.println("Why do we need upcasting?");
		ChromeDriver[] chromeArray = new ChromeDriver[3];
		FireFoxDriver[] firefoxArray = new FireFoxDriver[3];
		
		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = c;
		remoteArray[1] = f;
		remoteArray[2] = s;
		
		for(RemoteWebDriver driver: remoteArray) {
			System.out.println("--------");
			driver.open();
			driver.getScreenShot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();	
		}
		
		
		
		
	}

}
