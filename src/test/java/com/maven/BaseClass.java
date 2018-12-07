package com.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public void setup() {
		WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User.DESKTOP-QQUOJAQ\\eclipse-workspace\\POM\\Driver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().fullscreen();
	        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

}
