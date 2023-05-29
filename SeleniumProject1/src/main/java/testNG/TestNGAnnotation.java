package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	WebDriver driver;
	long starttime;
	long endtime;

	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 0)
	public void firsttestcase() {
		driver.get("https://www.google.co.in");

	}

	@Test(priority = 1)
	public void secondtestcase() {

		driver.get("https://in.search.yahoo.com");

	}

	@Test(priority = 2)
	public void thirdtestcase() {
		driver.get("https://www.bing.com/");

	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = starttime - endtime;
		System.out.println("Total Time Taken" + totaltime);

	}
}
//	Non Effective Method:
//  =====================

//	@Test(priority = 0)
//	public void firsttestcase() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		long totaltime = starttime - endtime;
//		System.out.println("Total Time Taken" + totaltime);
//	}
//
//	@Test(priority = 1)
//	public void secondtestcase() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://in.search.yahoo.com");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		long totaltime = starttime - endtime;
//		System.out.println("Total Time Taken" + totaltime);
//	}
//
//	@Test(priority = 2)
//	public void thirdtestcase() {
//		long starttime = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bing.com/");
//		driver.quit();
//		long endtime = System.currentTimeMillis();
//		long totaltime = starttime - endtime;
//		System.out.println("Total Time Taken" + totaltime);
//	}
