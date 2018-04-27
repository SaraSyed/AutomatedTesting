package com.qa.quickstart.maven_archetype_quickstart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectable {	

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
	public void test() {
		driver.get("http://demoqa.com/selectable/");
		
		Actions mouse = new Actions(driver);
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"selectable\"]/li[1]")));
		
		WebElement box1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement box2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		//WebElement box3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		
		
		mouse.click(box1).keyDown(Keys.CONTROL).click(box2).perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
