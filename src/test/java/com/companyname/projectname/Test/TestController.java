package com.companyname.projectname.Test;

import com.companyname.projectname.ReportUtils.ReportUtil;
import com.companyname.projectname.Test.Keywords;
import com.companyname.projectname.Utils.Resources;
import com.companyname.projectname.Utils.TestUtils;
import com.companyname.projectname.Data.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestController extends Resources{

	@BeforeClass
	public void initBrowser() throws IOException {
		Initialize();
	}

	@Test
	public void TestCaseController() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP EliteBook 8560W\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://localhost:9095//helloWorld";
		driver.get(baseUrl);
		Thread.sleep(3000);
		WebElement helloWorld = driver.findElement(By.xpath("//h2[contains(text(),'Hello World!')]"));
		if(helloWorld.isDisplayed()) {
			System.out.println("Test prosao");
		} else {
			System.out.println("Test pao");
		}
		driver.quit();
	}
	
	@AfterClass
	public void quitBrowser() {
		
	}
	
	
}
