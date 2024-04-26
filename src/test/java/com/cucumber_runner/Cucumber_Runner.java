package com.cucumber_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CucumberBaseClass.Cucumber_Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/cucumber_feature",
glue = "com.cucumber_stepdefinition",
//tags =("@Login1, @Login2"))
tags =("@Login1,@SearchHotel,@SelectHotel,@BookHotel"),
plugin = {"html:Report/Cucumber_Report", "pretty", 
		  "json:Report/Cucumber.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"})

public class Cucumber_Runner extends Cucumber_Base_Class {
	
	
	
	public static WebDriver driver;//Null driver
	
	@BeforeClass
	public static void BrowserLaunch() {
		driver = browserOpen();
		
		
	//browserOpen CONSIST FROM Cucucmber_Base_Class(imported from Cucumber_Base_Class)
		//Inside the browserOpen Method from Cucumber_Base_Class ---> We have created driver setup
		
//		public static WebDriver browserOpen() {
//			WebDriverManager.chromedriver().setup();
//			 sample = new ChromeDriver();
//			 sample.manage().window().maximize();
//			 return sample;
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", 
//				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		

		// Making WebDriver common to class(For all method, So we have to add Webdriver driver in class and also remove the WebDriver from Syntax)
		
		// WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

	}
	
	@AfterClass
	public static void BrowserClose() {
		 //driver.close();
		//Urlclose();
	}
	

}

	


