package com.interfaces;

public class ChromeDriver implements WebDriver {

	ChromeDriver(){
		System.out.println("Launch the browser");
	}

	@Override
	public void get(String url) {
		System.out.println("enter the URL" +url);
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("value of element" +locator);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void quit() {
		System.out.println("quit all the browsers");
	}
	
	
	
}
