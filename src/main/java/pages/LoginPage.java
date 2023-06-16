package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
 WebDriver driver;
  
 public LoginPage(WebDriver driver) {
   this.driver= driver;
 
 }
 
 @FindBy(how = How.CSS, using= "#extra > button:nth-child(12)") WebElement SkyBlueColor_Element;
 @FindBy(how = How.CSS, using= "#extra > button:nth-child(13)") WebElement SkyWhiteColor_Element;
 
 public void clickOnSkyBlueColor() {
	 SkyBlueColor_Element.click();
 }
 
 public void clickOnSkyWhiteColor() {
	 SkyWhiteColor_Element.click();
 }
 
 public String getPageTitle() {
	 return driver.getTitle();
 }
 
 
 
 
 
 
}
