package com.interfaces;

public class GoogleTest {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		
		driver.get("HTTP://goole.com");
		
		driver.findElement("Xpath of the element");
		
		driver.close();
		
		driver.quit();
		
	}

}
