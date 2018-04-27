package com.qa.quickstart.maven_archetype_quickstart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

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
	public void dragAndDrop() {
		driver.get("http://demoqa.com/draggable/");
		Actions mouse = new Actions(driver); // instatiating the mouse
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"draggable\"]")));
		
		WebElement box = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		mouse.dragAndDropBy(box, 100, 250).perform();

//		mouse.moveByOffset(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().x,
//				driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().y).clickAndHold()
//				.moveByOffset(100, 250).perform();
		//mouse.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"draggable\\\"]"))).clickAndHold().moveByOffset(100,200).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
