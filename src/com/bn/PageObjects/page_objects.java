package com.bn.PageObjects;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_objects {
	public static WebElement getElement(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#masthead-1 > div.wide.centered-width.box.logo-container > a"));
	}
}
