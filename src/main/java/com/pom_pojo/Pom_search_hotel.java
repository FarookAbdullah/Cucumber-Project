package com.pom_pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_search_hotel {
	
	public static WebDriver SHdriver; //Null driver

	// Encapsulation ---> Pom class
    @FindBy(id = "location")
	private WebElement loction;
    public WebElement getLoction() {
		return loction;
	}
    
    @FindBy(xpath ="//select[@name='hotels']")
    private WebElement hotels;
    public WebElement getHotels() {
		return hotels;
	}
    
    @FindBy(id = "room_type")
    private WebElement roomType;
    public WebElement getRoomType() {
		return roomType;
	}
    
    @FindBy(id = "room_nos")
    private WebElement no_of_Rooms;
    public WebElement getNo_of_Rooms() {
		return no_of_Rooms;
	}
    
    @FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;
    public WebElement getCheckInDate() {
		return checkInDate;
	}
    
    @FindBy(xpath = "//input[@name='datepick_out']")
    private WebElement checkOutDate;
    public WebElement getCheckOutDate() {
		return checkOutDate;
	}
    
    @FindBy(xpath = "//select[@name='adult_room']")
    private WebElement adultsPerRoom;
    public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
    
    @FindBy(id = "child_room")
    private WebElement childPerRoom;
    public WebElement getChildPerRoom() {
		return childPerRoom;
	}
    
    @FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
    public WebElement getSearchButton() {
		return searchButton;
	}
    
    @FindBy(id = "radiobutton_0")
    private WebElement radioButton;
    public WebElement getRadioButton() {
		return radioButton;
	}
  
    @FindBy(id= "continue")
    private WebElement selectHotelClick;
	public WebElement getSelectHotelClick() {
		return selectHotelClick;
	}


	//PAGEFACTORY CREATION ----> CONSTRUCTED FROM STEPDEFINITION AFTER WE PARAMETERIZE THE DRIVER which is driver = ChromeDriver
    public Pom_search_hotel(WebDriver driver) {
		this.SHdriver = driver;
		PageFactory.initElements(SHdriver, this);
	}

}	

	

	

	

	

	
