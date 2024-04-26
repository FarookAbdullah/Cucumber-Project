package com.cucumber_stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CucumberBaseClass.Cucumber_Base_Class;
import com.cucumber_runner.Cucumber_Runner;
import com.pom_pojo.Pom_login_page;
import com.sdp.adactin.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Cucumber_Base_Class {
	
	public static WebDriver driver = Cucumber_Runner.driver;//---> Before Base Class
//	public static WebDriver driver = Cucumber_Base_Class.sample;//-------> After Base Class
	
	// LOGIN PAGE -----> REF ------> pomRef
	//Pom_Pojo_Class pomRef = new Pom_Pojo_Class(); ---> Without Any Driver
	//Pom_login_page pomRef = new Pom_login_page(driver); //-----> By using driver i.e ChromeDriver ref Name (driver = Cucumber_Base_Class.sample)
	
	PageObjectManager pom = new PageObjectManager(driver);
	//PageObjectManager pom = new PageObjectManager(driver); //chrome
	//Login -->
	
	@Given("^User Launch the Adactin Website$")
	public void user_Launch_the_Adactin_Website() throws Throwable {
//		driver.get("https://adactinhotelapp.com/");
		urlLaunch("https://adactinhotelapp.com/");
	}

	@When("^User enter the Username in UserName Field$")
	public void user_enter_the_Username_in_UserName_Field() throws Throwable {
		//WebElement Username = driver.findElement(By.id("username"));
//		Username.sendKeys("Farook123");
//		sendKeys(Username, "Farook123");
		//sendKeys(pomRef.getUserName(), "Farook123");
//		sendKeys(pom.getPomRef().getUserName(),"Farook123" );
		sendKeys(pom.getPomRef().getUserName(), "Farook123");
	}
                    
	@Then("^User enter the Password in Password Field$")
	public void user_enter_the_Password_in_Password_Field() throws Throwable {
		//WebElement Password = driver.findElement(By.id("password"));
//		Password.sendKeys("Farook@1234");
//		sendKeys(Password, "Farook@1234");
		//sendKeys(pomRef.getPassword(), "Farook@1234");//sendKeys imported from Base class
//		sendKeys(pom.getPomRef().getPassword(),"Farook@1234" );
		sendKeys(pom.getPomRef().getPassword(), "Farook@1234");
	}

	@Then("^User click on the login button and then navigates to Search Hotel Booking$")
	public void user_click_on_the_login_button_and_then_navigates_to_Search_Hotel_Booking() throws Throwable {
		//WebElement ClickEle = driver.findElement(By.id("login"));
//		ClickEle.click();
		//click(ClickEle);
		//click(pomRef.getClick());
//		click(pom.getPomRef().getClick());
		click(pom.getPomRef().getClick());
		
	}
	
	@Then("^User enter the \"([^\"]*)\" name in Username Field$")
	public void user_enter_the_name_in_Username_Field(String Username1) throws Throwable {
		WebElement UserName = driver.findElement(By.id("username")); 
		//UserName.sendKeys(Username);
		sendKeys(UserName, Username1);
	}

	@Then("^User enter the \"([^\"]*)\" in Password Field$")
	public void user_enter_the_in_Password_Field(String Password1 ) throws Throwable {
		WebElement Passwrd = driver.findElement(By.id("password"));
		//Passwrd.sendKeys(Password);
		sendKeys(Passwrd, Password1);
		
	}

	@Then("^User click on the login button and then navigate to Search Hotel Booking$")
	public void user_click_on_the_login_button_and_then_navigate_to_Search_Hotel_Booking() throws Throwable {
		WebElement Click = driver.findElement(By.id("login"));
		//Click.click();
		//click(Click);
		
	}


}
