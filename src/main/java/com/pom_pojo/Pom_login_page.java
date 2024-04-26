package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_login_page {

	public static WebDriver logindriver;// Null

	@FindBy(id = "username")
	private WebElement UserName;

	public WebElement getUserName() {
		return UserName;
	}

	@FindBy(id = "password")
	private WebElement Password;

	public WebElement getPassword() {
		return Password;
	}

	@FindBy(id = "login")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
	

	public Pom_login_page(WebDriver driver) {
		this.logindriver = driver;
		PageFactory.initElements(logindriver, this);// this holds Current class refernce i.e = this.logindriver =
													// driver;
	}

}
