package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class testSteps {

	
	WebDriver driver;
	
	String usName = "";
	String expectedTitle = "Adactin.com - Search Hotel";
	
	
@Given("when the user is on the login page")
public void when_the_user_is_on_the_login_page() {
	
	System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("http://adactinhotelapp.com");
	
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
	//System.out.println("I am in Login Page");
	}

@When("user enters user name and password")
public void user_enters_user_name_and_password() {
	
	 	WebElement uName= driver.findElement(By.id("username"));
	    uName.sendKeys("RajendraBabu07");
	    usName = "RajendraBabu07";
	    driver.findElement(By.id("password")).sendKeys("8J1O4L");
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User will enter Name and Password");
}


@When("user enters \"(.*)\", \"(.*)\"$")
public void user_enters(String userName,String passWord) {
	
	 	WebElement uName= driver.findElement(By.id("username"));
	    uName.sendKeys(userName);
	    usName = userName;	
	    driver.findElement(By.id("password")).sendKeys(passWord);
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("User will enter Name and Password");
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {

	driver.findElement(By.id("login")).click();
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login button is clicked");
}

@Then("login is successfull")
public void login_is_successfull() {
	String actualGreeting = driver.findElement(By.name("username_show")).getAttribute("value");
	
	//String greeting = driver.getTitle();
	//System.out.println(actualGreeting);

			
	//System.out.println("Page title is : " + driver.getTitle());
    // Write code here that turns the phrase above into concrete actions
	//System.out.println("Login Success");
	
	String expectedGreeting = "Hello "+usName+"!";
	assertEquals(expectedGreeting, actualGreeting);
	
	
}

@Then("Search page is displayed")
public void search_page_is_displayed() {
	
	String actualTitle = driver.getTitle();
	assertEquals(expectedTitle, actualTitle);
	
	
    // Write code here that turns the phrase above into concrete actions
	//System.out.println("Search page is disaplyed");


}



@When("user selects \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
public void user_selects(String location, String rooms, String checkindate, String checkoutdate, String adults) {
	  //Drop down  to select LOCATION
    new Select(driver.findElement(By.className("search_combobox"))).selectByValue(location);


    //Drop down to select Number of Rooms
     new Select(driver.findElement(By.id("room_nos"))).selectByValue(rooms);

     //Date picker-Enter check in date
     WebElement checkinDate = driver.findElement(By.id("datepick_in"));
     checkinDate.clear();
     checkinDate.sendKeys(checkindate);

     //Date picker-Enter checkout date
     WebElement checkoutDate = driver.findElement(By.id("datepick_out"));
     checkoutDate.clear();
     checkoutDate.sendKeys(checkoutdate);

     //Select Adults per room
     new Select(driver.findElement(By.id("adult_room"))).selectByValue(adults);

}



@When("user clicks on search")
public void user_clicks_on_search_button() {
//Click on Search
driver.findElement(By.id("Submit")).click();
}



@Then("search results should be displayed")
public void search_results_should_be_displayed() {
System.out.println("Successful search page");


}

@Given("This is a blank test")
public void this_is_a_blank_test() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Blank Test");
}
}

