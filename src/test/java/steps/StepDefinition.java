package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase{
	
	LoginPage loginPage;
	
	@Given ("User is on the todo list page")
	public void User_is_on_the_todo_list_page() {
	initDriver();
	driver.get("http://techfios.com/test/102/");
	}
	
	@When ("User click on Set SkyBlue Background color")
	public void User_click_on_Set_SkyBlue_Background_color() {
	 loginPage= PageFactory.initElements(driver, LoginPage.class);
	 loginPage.clickOnSkyBlueColor();
	}
	
	@Then("User change to the SkyBlue Background color")
	public void user_change_to_the_SkyBlue_Background_color() {
	   String expectedTitle = "SkyBlue Background";
	   String actualTitle = loginPage.getPageTitle();
	  Assert.assertTrue(driver.findElement(By.cssSelector("#extra > button:nth-child(12)")).isDisplayed());
	}
	
	
	
	@When("User click on Set SkyWhite Background color")
	public void user_click_on_Set_SkyWhite_Background_color() {
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickOnSkyWhiteColor();  
	}

	@Then("User change to the SkyWhite Background color")
	public void user_change_to_the_SkyWhite_Background_color() {
		String expectedTitle = "SkyWhite Background";
		   String actualTitle = loginPage.getPageTitle();
		  Assert.assertTrue(driver.findElement(By.cssSelector("#extra > button:nth-child(13)")).isDisplayed());
	    
	}



}
