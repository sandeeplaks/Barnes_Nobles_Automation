package com.bn.PageObjects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bn_page_objects 
{
private WebDriver driver;

@Before
public void beforeTest()
{
	driver = new FirefoxDriver();
}

@Test
public void test() throws InterruptedException
{
	driver.get("http://www.barnesandnoble.com/");
	page_objects.getElement(driver).click();
	Thread.sleep(3000);
	System.out.println(page_objects.getElement(driver).getText() + " " + "is clicked");
}


@After
public void afterTest()
{
	driver.close();
	driver.quit();
}

}
