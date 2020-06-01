package org.testprallel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseLevel
{
	 WebDriver driver;
	@Parameters({"driver"})
	@Test
	public void test(String s) {
		if(s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		else if(s.equals("gecko")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			driver.get("https://www.facebook.com");
		}
		}
		
}
	


