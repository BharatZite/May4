package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='user-name']") private WebElement email;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Entermail(String mail) {
		email.sendKeys(mail);
	}
	
	public void Enterpass(String passward) {
		pass.sendKeys(passward);
	}
	
	public void ClickLogin() {
		login.click();
	}
	
}
