$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Website",
  "description": "",
  "id": "hotel-booking-in-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Launch the Application",
  "description": "",
  "id": "hotel-booking-in-adactin-website;user-launch-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch the Adactin Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the Username in UserName Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enter the Password in Password Field",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on the login button and then navigates to Search Hotel Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_the_Adactin_Website()"
});
formatter.result({
  "duration": 15704634300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Username_in_UserName_Field()"
});
formatter.result({
  "duration": 128481600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_Password_in_Password_Field()"
});
formatter.result({
  "duration": 61053400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_login_button_and_then_navigates_to_Search_Hotel_Booking()"
});
formatter.result({
  "duration": 526104300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#@Login2"
    },
    {
      "line": 11,
      "value": "#Scenario Outline: User Launch the Application"
    },
    {
      "line": 12,
      "value": "#Given User Launch the Adactin Website"
    },
    {
      "line": 13,
      "value": "#Then User enter the \"\u003cUsername\u003e\" name in Username Field"
    },
    {
      "line": 14,
      "value": "#Then User enter the \"\u003cPassword\u003e\" in Password Field"
    },
    {
      "line": 15,
      "value": "#Then User click on the login button and then navigate to Search Hotel Booking"
    },
    {
      "line": 17,
      "value": "#Examples:"
    },
    {
      "line": 18,
      "value": "#"
    },
    {
      "line": 19,
      "value": "#\t\t|Username     |Password   |"
    },
    {
      "line": 20,
      "value": "#\t\t|Farook123    |Farook@1234|"
    },
    {
      "line": 21,
      "value": "#\t    |mohammedfazil|fazil12345 |"
    }
  ],
  "line": 24,
  "name": "User Launch the Search Hotel page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;user-launch-the-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User Selects the Location in Select Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Selects the Hotel in Select Hotel Field",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Selects the Room Type in Select Roomtype Field",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User Selects the No.of.Rooms in Select No.of.Rooms Field",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User enters the Checkin Date in CheckinDate Field",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User enters the Checkin Date in CheckinDate Field",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User enters the Checkout Date in CheckOutDate Field",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User Selects No.of.Adults in Select Adults per Room Field",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User Selects No.of.Children Type in Select Children per Room Field",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User click on the Search button and then navigates to Booking Confirmation Page",
  "keyword": "And "
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_Location_in_Select_Location_Field()"
});
formatter.result({
  "duration": 252876600,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_Hotel_in_Select_Hotel_Field()"
});
formatter.result({
  "duration": 204263400,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_Room_Type_in_Select_Roomtype_Field()"
});
formatter.result({
  "duration": 205738500,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_No_of_Rooms_in_Select_No_of_Rooms_Field()"
});
formatter.result({
  "duration": 305830500,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_enters_the_Checkin_Date_in_CheckinDate_Field()"
});
formatter.result({
  "duration": 390941400,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_enters_the_Checkin_Date_in_CheckinDate_Field()"
});
formatter.result({
  "duration": 246642700,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_enters_the_Checkout_Date_in_CheckOutDate_Field()"
});
formatter.result({
  "duration": 142032700,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_No_of_Adults_in_Select_Adults_per_Room_Field()"
});
formatter.result({
  "duration": 100043800,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_No_of_Children_Type_in_Select_Children_per_Room_Field()"
});
formatter.result({
  "duration": 92445800,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_click_on_the_Search_button_and_then_navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 377979400,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User Launch the Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;user-launch-the-select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User Selected the Hotel Name",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User Click the continue button and navigates to Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Select_Step_Definition.user_Selected_the_Hotel_Name()"
});
formatter.result({
  "duration": 59053100,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Click_the_continue_button_and_navigates_to_Book_Hotel_Page()"
});
formatter.result({
  "duration": 337891000,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User Launch the Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-website;user-launch-the-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "User writes the First Name in First Name Field",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User writes the Last Name in Last Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User writes the Billing Address in Billing Address Field",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User writes the Credit Card Number in Credit Card Number Field",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User writes the Credit Card Type in Credit Card Type Field",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User Selects the Expiry Month in the Expiry Date Field",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "User Selects the Expiry Year in the Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User writes the cvv number in cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User clicks the Book Now Button in Book Now Button Field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User clicks the My itinerary Button in My itinerary Button Field",
  "keyword": "And "
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_First_Name_in_First_Name_Field()"
});
formatter.result({
  "duration": 76211500,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_Last_Name_in_Last_Name_Field()"
});
formatter.result({
  "duration": 58832800,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_Billing_Address_in_Billing_Address_Field()"
});
formatter.result({
  "duration": 60187800,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_Credit_Card_Number_in_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 70258100,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_Credit_Card_Type_in_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 162787100,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_Expiry_Month_in_the_Expiry_Date_Field()"
});
formatter.result({
  "duration": 172818800,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_Selects_the_Expiry_Year_in_the_Expiry_Date_Field()"
});
formatter.result({
  "duration": 154154200,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_writes_the_cvv_number_in_cvv_Number_Field()"
});
formatter.result({
  "duration": 117396000,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_clicks_the_Book_Now_Button_in_Book_Now_Button_Field()"
});
formatter.result({
  "duration": 103895000,
  "status": "passed"
});
formatter.match({
  "location": "Select_Step_Definition.user_clicks_the_My_itinerary_Button_in_My_itinerary_Button_Field()"
});
formatter.result({
  "duration": 6345006500,
  "status": "passed"
});
});