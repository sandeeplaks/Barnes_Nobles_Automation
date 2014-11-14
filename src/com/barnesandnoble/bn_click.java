package com.barnesandnoble;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bn_click {
	private WebDriver driver;
	@Before
	public void beforeTest()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	public void test() throws InterruptedException{
		driver.get("http://www.barnesandnoble.com/");
		driver.findElement(By.cssSelector("#masthead-1 > div.wide.centered-width.box.logo-container > a")).click();
		Thread.sleep(3000);
	}
	
	@After
	public void afterTest()
	{
		driver.close();
		driver.quit();
	}
	

}
