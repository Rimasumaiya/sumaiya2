package com.Bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {

	public static void hoverover(WebElement ele) {
		Actions a=new Actions(null);
		a.moveToElement(ele).perform();
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
}
