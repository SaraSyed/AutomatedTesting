package com.qa.quickstart.maven_archetype_quickstart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortableTest {

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

		driver.get("http://demoqa.com/sortable/");

		Actions mouse = new Actions(driver);

		WebElement box6 = null;
		WebElement box2 = null;

		// box1 = driver.findElement(By.cssSelector("#sortable > li:nth-child(1)"));

		box2 = driver.findElement(By.cssSelector("#sortable > li:nth-child(2)"));
		//
		// WebElement box3 = driver.findElement(By.cssSelector("#sortable >
		// li:nth-child(3)"));
		//
		// WebElement box4 = driver.findElement(By.cssSelector("#sortable >
		// li:nth-child(4)"));
		//
		//
		// WebElement box5 = driver.findElement(By.cssSelector("#sortable >
		// li:nth-child(5)"));
		//
		box6 = driver.findElement(By.cssSelector("#sortable > li:nth-child(6)"));
		// Point temp = box2.getLocation();
		mouse.dragAndDrop(box6, box2).perform(); // - switches back

		// mouse.dragAndDrop(box3, box5).perform();
		//
		// mouse.dragAndDrop(box6, box2).perform();

		// mouse.dragAndDrop(box1, temp).perform();
		// mouse.moveToElement(box1).clickAndHold(box1).moveToElement(box2).release(box1).perform();

		// .moveByOffset(temp.x, temp.y)
		// WebElement item = null;
		//
		// for (int i = 1; i < 8; i += 2) {
		//
		// item = driver.findElement(By.cssSelector("#sortable > li:nth-child(" + i +
		// ")"));
		//
		// mouse.dragAndDropBy(item, 0, 100).perform();
		// }
		//
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
