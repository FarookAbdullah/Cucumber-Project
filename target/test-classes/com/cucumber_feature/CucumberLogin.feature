Feature: Hotel Booking in Adactin Website 

@Login1
Scenario: User Launch the Application 
	Given User Launch the Adactin Website 
	When User enter the Username in UserName Field 
	Then User enter the Password in Password Field 
	Then User click on the login button and then navigates to Search Hotel Booking
	
#@Login2
#Scenario Outline: User Launch the Application
#Given User Launch the Adactin Website
#Then User enter the "<Username>" name in Username Field
#Then User enter the "<Password>" in Password Field
#Then User click on the login button and then navigate to Search Hotel Booking

#Examples:
#	
#		|Username     |Password   |
#		|Farook123    |Farook@1234|	
#	    |mohammedfazil|fazil12345 |
	    
@SearchHotel
Scenario: User Launch the Search Hotel page
When User Selects the Location in Select Location Field	    
Then User Selects the Hotel in Select Hotel Field
Then User Selects the Room Type in Select Roomtype Field
Then User Selects the No.of.Rooms in Select No.of.Rooms Field
Then User enters the Checkin Date in CheckinDate Field
Then User enters the Checkin Date in CheckinDate Field
Then User enters the Checkout Date in CheckOutDate Field
Then User Selects No.of.Adults in Select Adults per Room Field
Then User Selects No.of.Children Type in Select Children per Room Field
And User click on the Search button and then navigates to Booking Confirmation Page

@SelectHotel
Scenario: User Launch the Select Hotel Page
Then User Selected the Hotel Name
Then User Click the continue button and navigates to Book Hotel Page

@BookHotel
Scenario: User Launch the Book Hotel Page
Given User writes the First Name in First Name Field
When User writes the Last Name in Last Name Field
Then User writes the Billing Address in Billing Address Field
Then User writes the Credit Card Number in Credit Card Number Field
Then User writes the Credit Card Type in Credit Card Type Field
Then User Selects the Expiry Month in the Expiry Date Field
And User Selects the Expiry Year in the Expiry Date Field
And User writes the cvv number in cvv Number Field
And User clicks the Book Now Button in Book Now Button Field
And User clicks the My itinerary Button in My itinerary Button Field









