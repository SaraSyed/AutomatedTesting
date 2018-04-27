package com.qa.quickstart.maven_archetype_quickstart;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class BlackJackTest {

	WebDriver driver;

	@Before
	public void selTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAC\\Desktop\\WebDev\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	@Ignore
	public void qaTest() {
		// driver.get("http://www.qa.com");
		// driver.findElement(By.xpath("//*[@id=\"services\"]/div[2]/div[2]/div[4]/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/section[1]/div[2]/div[2]/div[4]/a")).click();
		// assertEquals();

		driver.get("http://thedemosite.co.uk ");
		driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
				.sendKeys("test");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
				.sendKeys("password123");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
				.click();

		driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
				.sendKeys("test");
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
				.sendKeys("password123");

		// initialize ExtentReports with a file path
		ExtentReports extent = new ExtentReports("C:\\Users\\QAC\\Documents\\Reports\\test.html", true);
		ExtentTest test;

		// initialize / start the test
		test = extent.startTest("Verify application Title");

		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");

		// report the test as a pass
		test.log(LogStatus.PASS, "verify Title of the page");

		extent.endTest(test);
		extent.flush();

	}

	@Test
	@Ignore
	public void excelTest() {

		FileInputStream file = null;
		try {
			file = new FileInputStream(Constant.Path_TestData + Constant.File_TestData);
		} catch (FileNotFoundException e) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFCell cell = sheet.getRow(0).getCell(0);
		System.out.println(cell.getStringCellValue());
	}

	@Test
	@Ignore
	public void dragAndDrop() {
		driver.get("http://demoqa.com/draggable/");
		Actions mouse = new Actions(driver); // instatiating the mouse
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"draggable\"]")));

		mouse.moveByOffset(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().x,
				driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().y).clickAndHold()
				.moveByOffset(100, 250).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// @Test
// public void test() {
// //fail("Not yet implemented");
//
// BlackJack blackjack = new BlackJack();
//
// assertEquals(10, blackjack.play(10, 22));
// assertEquals(9, blackjack.play(22, 9));
// assertEquals(0, blackjack.play(22, 22));
// assertEquals(10, blackjack.play(10, 7));
// assertEquals(19, blackjack.play(1, 19));
//
// }