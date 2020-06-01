package org.testprallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MultiBrowser {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test2() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test3() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
	}
}
