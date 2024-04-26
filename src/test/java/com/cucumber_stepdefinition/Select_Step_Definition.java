package com.cucumber_stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber_runner.Cucumber_Runner;
import com.pom_pojo.Pom_Book_Hotel;
import com.pom_pojo.Pom_search_hotel;
import com.sdp.adactin.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Select_Step_Definition {
	
	public static WebDriver driver = Cucumber_Runner.driver; //chrome driver
	
	// LOGIN PAGE --------------> REF ------> pomRef
	// SEARCH HOTEL PAGE -------> REF ------> shref
	// BOOK HOTEL PAGE ---------> REF ------> bhref
	// PAGE OBJECT MANAGER -----> REF ------> pom
	
//	Pom_search_hotel shref = new Pom_search_hotel(driver);
//	Pom_Book_Hotel bhref = new Pom_Book_Hotel(driver);
	PageObjectManager pom = new PageObjectManager(driver); //chrome
	
	public static Select select;//Making select global reference for entire class

	
	@When("^User Selects the Location in Select Location Field$")
	public void user_Selects_the_Location_in_Select_Location_Field() throws Throwable {
//		WebElement Location = driver.findElement(By.id("location"));// We can handle stepdefinition logics using Encapsulation technic by Pom class which is Hiding WebElements
		//select = new Select(Location);
//		select = new Select(shref.getLoction());//Passing reference name.particular webElement since we have hide the WebElement Location = driver.findElement(By.id("location"));
//		select = new Select(pom.getShref().getLoction()); //sdp
		select  = new Select(pom.getShref().getLoction());
		
		// We create foreach only for obtaining list of WebElement i.e getoptions()
		List<WebElement> AllOptions = select.getOptions();
		for (WebElement NumberOfAllOptions : AllOptions) {
			System.out.println(NumberOfAllOptions.getText());
			
		}
		
		select.selectByIndex(3);
	}

	@Then("^User Selects the Hotel in Select Hotel Field$")
	public void user_Selects_the_Hotel_in_Select_Hotel_Field() throws Throwable {
		
//		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']")); 
//		select = new Select(hotels);
		//select = new Select(shref.getHotels());
		select = new Select(pom.getShref().getHotels());
		select.selectByVisibleText("Hotel Creek");
		
	}

	@Then("^User Selects the Room Type in Select Roomtype Field$")
	public void user_Selects_the_Room_Type_in_Select_Roomtype_Field() throws Throwable {
		WebElement RoomType = driver.findElement(By.id("room_type"));
		//select = new Select(RoomType);
//		select = new Select(shref.getRoomType());
		select = new Select(pom.getShref().getRoomType());
		select.selectByValue("Deluxe");
	}

	@Then("^User Selects the No\\.of\\.Rooms in Select No\\.of\\.Rooms Field$")
	public void user_Selects_the_No_of_Rooms_in_Select_No_of_Rooms_Field() throws Throwable {
		WebElement RoomNumbers = driver.findElement(By.id("room_nos"));
		//select = new Select(RoomNumbers);
//		select = new Select(shref.getNo_of_Rooms());
		select = new Select(pom.getShref().getNo_of_Rooms());
		select.selectByValue("7");
	}

	@Then("^User enters the Checkin Date in CheckinDate Field$")
	public void user_enters_the_Checkin_Date_in_CheckinDate_Field() throws Throwable {
//		WebElement CheckDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//		CheckDate.clear();
//		CheckDate.sendKeys("01/01/2025");
//		shref.getCheckInDate().clear();
//		shref.getCheckInDate().sendKeys("01/01/2025");
		pom.getShref().getCheckInDate().clear();
		pom.getShref().getCheckInDate().sendKeys("01/01/2025");

		
	}

	@Then("^User enters the Checkout Date in CheckOutDate Field$")
	public void user_enters_the_Checkout_Date_in_CheckOutDate_Field() throws Throwable {
//		WebElement CheckoutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//		CheckoutDate.clear();
//		CheckoutDate.sendKeys("03/01/2025");
//		shref.getCheckOutDate().clear();
//		shref.getCheckOutDate().sendKeys("03/01/2025");
		pom.getShref().getCheckOutDate().clear();
		pom.getShref().getCheckOutDate().sendKeys("03/01/2025");
	}

	@Then("^User Selects No\\.of\\.Adults in Select Adults per Room Field$")
	public void user_Selects_No_of_Adults_in_Select_Adults_per_Room_Field() throws Throwable {
//		WebElement AdultRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
//		select = new Select(AdultRoom);
//		select = new Select(shref.getAdultsPerRoom());
		select = new Select(pom.getShref().getAdultsPerRoom());
		select.selectByVisibleText("4 - Four");
	}

	@Then("^User Selects No\\.of\\.Children Type in Select Children per Room Field$")
	public void user_Selects_No_of_Children_Type_in_Select_Children_per_Room_Field() throws Throwable {
//		WebElement ChildRoom = driver.findElement(By.id("child_room"));
//		select = new Select(ChildRoom);
//		select = new Select(shref.getChildPerRoom());
		select = new Select(pom.getShref().getChildPerRoom());
		select.selectByValue("3");
	}

	@Then("^User click on the Search button and then navigates to Booking Confirmation Page$")
	public void user_click_on_the_Search_button_and_then_navigates_to_Booking_Confirmation_Page() throws Throwable {
//		WebElement HotelBookingClick = driver.findElement(By.xpath("//input[@type='submit']"));
//		HotelBookingClick.click();
//		shref.getSearchButton().click();
		pom.getShref().getSearchButton().click();
	}
	
	@Then("^User Selected the Hotel Name$")
	public void user_Selected_the_Hotel_Name() throws Throwable {
//		WebElement RadioButton = driver.findElement(By.id("radiobutton_0"));
		//RadioButton.click();
//		shref.getRadioButton().click();
		pom.getShref().getRadioButton().click();
	}

	@Then("^User Click the continue button and navigates to Book Hotel Page$")
	public void user_Click_the_continue_button_and_navigates_to_Book_Hotel_Page() throws Throwable {
//		WebElement SelectHotelClick = driver.findElement(By.id("continue"));
		//SelectHotelClick.click();
//		shref.getSelectHotelClick().click();
		pom.getShref().getSelectHotelClick().click();
	}
	
	@Given("^User writes the First Name in First Name Field$")
	public void user_writes_the_First_Name_in_First_Name_Field() throws Throwable {
//		WebElement FirstName = driver.findElement(By.xpath("//input[@name='first_name']"));
		//FirstName.sendKeys("Mohamed");
//		bhref.getFirstName().sendKeys("Mohamed");
		pom.getBhref().getFirstName().sendKeys("Mohamed");
		
	}

	@When("^User writes the Last Name in Last Name Field$")
	public void user_writes_the_Last_Name_in_Last_Name_Field() throws Throwable {
//		WebElement LastName = driver.findElement(By.id("last_name"));
		//LastName.sendKeys("Farook");
//		bhref.getLastName().sendKeys("Farook");
		pom.getBhref().getLastName().sendKeys("Farook");
	    
	}

	@Then("^User writes the Billing Address in Billing Address Field$")
	public void user_writes_the_Billing_Address_in_Billing_Address_Field() throws Throwable {
//		WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
		//Address.sendKeys("Tambaram");
//		bhref.getAddress().sendKeys("Tambaram");
		pom.getBhref().getAddress().sendKeys("Tambaram");
	}

	@Then("^User writes the Credit Card Number in Credit Card Number Field$")
	public void user_writes_the_Credit_Card_Number_in_Credit_Card_Number_Field() throws Throwable {
//		WebElement CreditCardNum = driver.findElement(By.id("cc_num"));
		//CreditCardNum.sendKeys("1234567890123459");
//		bhref.getCreditCardNo().sendKeys("1234567890123459");
		pom.getBhref().getCreditCardNo().sendKeys("1234567890123459");
	}
	@Then("^User writes the Credit Card Type in Credit Card Type Field$")
	public void user_writes_the_Credit_Card_Type_in_Credit_Card_Type_Field() throws Throwable {
//		WebElement CardType = driver.findElement(By.id("cc_type"));
		//select = new Select(CardType);
//		select = new Select(bhref.getCardType());
		select = new Select(pom.getBhref().getCardType());
		select.selectByIndex(2);
	}

	@Then("^User Selects the Expiry Month in the Expiry Date Field$")
	public void user_Selects_the_Expiry_Month_in_the_Expiry_Date_Field() throws Throwable {
//		WebElement ExpiryMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		//select = new Select(ExpiryMonth);
//		select = new Select(bhref.getExpiryMonth());
		select = new Select(pom.getBhref().getExpiryMonth());
		select.selectByValue("8");
	}

	@Then("^User Selects the Expiry Year in the Expiry Date Field$")
	public void user_Selects_the_Expiry_Year_in_the_Expiry_Date_Field() throws Throwable {
//		WebElement ExpiryYear = driver.findElement(By.id("cc_exp_year"));
//		select = new Select(ExpiryYear);
//		select = new Select(bhref.getExpiryYear());
		select = new Select(pom.getBhref().getExpiryYear());
		select.selectByVisibleText("2025");
	}

	@Then("^User writes the cvv number in cvv Number Field$")
	public void user_writes_the_cvv_number_in_cvv_Number_Field() throws Throwable {
//		WebElement Cvv = driver.findElement(By.id("cc_cvv"));
//		Cvv.sendKeys("232323");
//		bhref.getCvv().sendKeys("232323");
		pom.getBhref().getCvv().sendKeys("232323");
	}

	@Then("^User clicks the Book Now Button in Book Now Button Field$")
	public void user_clicks_the_Book_Now_Button_in_Book_Now_Button_Field() throws Throwable {
//		WebElement BookNowClick = driver.findElement(By.id("book_now"));
//		BookNowClick.click();
//		bhref.getBookNowButton().click();
		pom.getBhref().getBookNowButton().click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@Then("^User clicks the My itinerary Button in My itinerary Button Field")
	public void user_clicks_the_My_itinerary_Button_in_My_itinerary_Button_Field() throws Throwable {
//		WebElement MyItinearary = driver.findElement(By.id("my_itinerary"));
//		MyItinearary.click();
//		bhref.getMyItinerary().click();
		pom.getBhref().getMyItinerary().click();
	}

}
