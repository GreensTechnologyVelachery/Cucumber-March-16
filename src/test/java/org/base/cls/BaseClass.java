package org.base.cls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	/*
	 * Base class contains only reusable methods ( just for storing the method )
	 * 
	 * No main method
	 */

	public static WebDriver driver;

	public static void browserLaunch(String browserName) {

		switch (browserName) { 
		 
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		default:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static String getEnteredText(WebElement ele) {

		String attr = ele.getAttribute("value");
		return attr;
	}

	public static String getThePageTitle() {

		String title = driver.getTitle();
		return title;
	}

	public static void getTheUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void closeBrowser() {

		driver.quit();
	}

	public static void passTheTxt(WebElement element, String txt) {

		element.sendKeys(txt);
	}

	public static void clickWebElement(WebElement element) {

		element.click();
	}

	public static void takeTheScreenshot(String imageName) throws IOException {

		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\VISHAL\\eclipse-workspace\\Maven_New_10.30am\\Screenshots\\" + imageName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetElement) {

		a = new Actions(driver);
		a.moveToElement(targetElement).perform();
	}

	public static void dragDrop(WebElement dragWebElement, WebElement dropWebElement) {

		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropWebElement).perform();
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(boolean bool, WebElement tarElement) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + bool + ")", tarElement);
	}

	public static void clickUsingJavascript(WebElement tarElement) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", tarElement);
	}

	public static String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws IOException {

		// 1. Excel file path location
		File f = new File("C:\\Users\\VISHAL\\eclipse-workspace\\Maven_New_10.30am\\Excel File\\newfile.xlsx");

		// 2. To read excel file
		FileInputStream fis = new FileInputStream(f); // throw --> FileNotFoundException

		// 3. To read exact .xlsx file format
		Workbook w = new XSSFWorkbook(fis); // throw --> IOException

		// Workbook------------sheet ----------row------------cell---------- datas

		// 4. To get sheet from workbook
		Sheet s = w.getSheet(sheetName);

		// 5. To iterate all the row from sheet

		Row r = s.getRow(rowNum);

		// 6. To iterate all the cells from each row

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		// By default cellType == 1 ---> String Cell
		// Whether cellType otherthan 1 ---> Date Cell / Numeric Cell

		String values = "";

		if (cellType == 1) { // it will return true only for String Cell

			values = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) { // it will return try only for Date Cell

			Date d = c.getDateCellValue(); // Thu Apr 12 00:00:00 IST 1990
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy"); // 12-04-1990
			values = sim.format(d); // 12-04-1990
		} else {

			double dd = c.getNumericCellValue(); // 83744.0
			long l = (long) dd; // 83744
			values = String.valueOf(l); // "83744"
		}
		return values;

	}

	public static String dbDatas() {

		Connection con = null;

		String cnameClmn = "";

		try {

			// 1. Load the driver - oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver"); // throw - ClassNotFoundException

			// 2. Connect to database - jdbc:oracle:thin:@localhost:1521:xe
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");

			// 3. Write a SQL query
			String que = "select cname from course where cname='Python'";

			// 4. Prepare the statement
			PreparedStatement pr = con.prepareStatement(que);

			// 5. execute query
			ResultSet ex = pr.executeQuery();

			// 6. Iterate the row one by one from table
			// if row presented in a table it will return true otherwise it will return
			// false
			if (ex.next()) {

				cnameClmn = ex.getString("cname");
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {

			try {

				// 7. Close the db connection
				con.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return cnameClmn;
	}

}
