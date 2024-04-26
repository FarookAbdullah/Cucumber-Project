package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Book_Hotel {
	
	public static WebDriver BHdriver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id = "cc_num")
	private WebElement creditCardNo;
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	public WebElement getCardType() {
		return cardType;
	}
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiryMonth;
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(id = "book_now")
	private WebElement bookNowButton;
	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	
	@FindBy(id = "my_itinerary")
	private WebElement myItinerary;
	public WebElement getMyItinerary() {
		return myItinerary;
	}
	
	
	public Pom_Book_Hotel(WebDriver driver) {
		this.BHdriver = driver;
		PageFactory.initElements(BHdriver, this);// We need to create PageFactory since we are calling the WebElement
	}
	

}

	


	


	


	


	


	


	


	


	


	
