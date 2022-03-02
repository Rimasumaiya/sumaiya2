package com.bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
	
	WebDriver dr;
	public void openbrowser() {
		dr=new ChromeDriver();
	}
	
	public homePage goToUrl() {
		dr.get("https://www.express.com/");
		return new homePage();
		
	}

	
	
}
