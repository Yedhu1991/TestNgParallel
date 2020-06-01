package org.fail;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ExecutionClass {
	static WebDriver driver;
@BeforeMethod
public void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yedhu\\eclipse-workspace\\TestNgParellal\\dir\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ref=nav_logo");
}
@AfterMethod
public void close() {
	driver.quit();
}
@Test
public void test1() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
}
@Test
public void test2() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	Assert.assertTrue(false);
}
@Test
public void test3() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	Assert.assertTrue(false);
}
	
}
