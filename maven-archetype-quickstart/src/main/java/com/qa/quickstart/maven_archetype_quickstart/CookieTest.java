package com.qa.quickstart.maven_archetype_quickstart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {
	
	WebDriver driver;

	@Before
	public void selTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAC\\Desktop\\WebDev\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void cookies() {
		fail("Not yet implemented");
	}

}