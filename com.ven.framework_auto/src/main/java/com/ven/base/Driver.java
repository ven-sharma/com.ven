package com.ven.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	private WebDriver driver;
	
	public void initiateDriver(String browserName) {
		setBrowserDriver(browserName);
	}

	private void setBrowserDriver(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			this.driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("Firefox")) {
			this.driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("IE")) {
			this.driver = new InternetExplorerDriver();
		}
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void killDriver() {
		this.driver.close();
	}

}
