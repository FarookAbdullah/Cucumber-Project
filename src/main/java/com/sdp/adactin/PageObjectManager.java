package com.sdp.adactin;

import org.openqa.selenium.WebDriver;

import com.pom_pojo.Pom_Book_Hotel;
import com.pom_pojo.Pom_login_page;
import com.pom_pojo.Pom_search_hotel;

public class PageObjectManager {
	
	public static WebDriver POMdriver;// Null Driver
	
//	Pom_login_page pomRef = new Pom_login_page(driver); 
//	Pom_search_hotel shref = new Pom_search_hotel(driver);
	
	private Pom_login_page pomRef;
	public Pom_login_page getPomRef() {
		pomRef = new Pom_login_page(POMdriver);// we should create object in the class file instead of Stepdefinition which makes the code more secure
		return pomRef;
	}
	
	private Pom_search_hotel shref;
	public Pom_search_hotel getShref() {
		shref = new Pom_search_hotel(POMdriver);// We should parameterise the current class reference which is POMdriver in this case
		return shref;
	}
	
	private Pom_Book_Hotel bhref;
	public Pom_Book_Hotel getBhref() {
		bhref = new Pom_Book_Hotel(POMdriver);
		return bhref;
	}


	// CONSTRUCTION METHOD
	public PageObjectManager(WebDriver driver) {
		this.POMdriver = driver;//ChromeDriver
		// No need to create PageFactory since we are calling the object in PageObjectManager and not the WebElement
	}

	


	
	

	
	
}
