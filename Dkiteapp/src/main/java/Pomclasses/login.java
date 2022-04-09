package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath="//input[@type='text']")private WebElement username;
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//button[@value='1']")private WebElement loginbtn;
	@FindBy(xpath="//a[@aria-label='Marketplace']")private WebElement marketplace;
	

	login(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void enterun() {
		username.sendKeys("rskapse21@gmail.com");
	}
	public void pass() {
		pass.sendKeys("Rohankapse@040497");
	}
	public void loginkro() {
		loginbtn.click();	
		
	}
	public void market() {
		marketplace.click();	
}
}
