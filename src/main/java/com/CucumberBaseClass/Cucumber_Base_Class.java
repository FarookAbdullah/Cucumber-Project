package com.CucumberBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Base_Class {
	public static WebDriver sample;// Null Driver

	// BROWSER LAUNCH SETUP
	
	public static WebDriver browserOpen() {
		WebDriverManager.chromedriver().setup();
		 sample = new ChromeDriver();
		 sample.manage().window().maximize();
		 return sample;
		

	}


	// Before Base Class
//	WebDriverManager.chromedriver().setup();
//	sample = new ChromeDriver();
//	sample.get("https://adactinhotelapp.com/");}

	// After Base Class
	public static void urlLaunch(String Url) {
		
		sample.get(Url);
		

	}

	// SENDKEYS ----> UserName & Password
	public static void sendKeys(WebElement element, String Key) {

		element.sendKeys(Key);
	}

	// CLICK

	public static void click(WebElement element) {

		element.click();
	}

	// CLOSE

	public static void Urlclose() {

		sample.close();

	}
	
	

}
