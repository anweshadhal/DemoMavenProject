package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class loginPage {
	
	@FindBy(id="email")
	WebElement txt_userID;
	
	@FindBy(id="pass")
	WebElement txt_password;
	
	@FindBy(name="login")
	WebElement btn_login;

	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserPass(String UserId,String Password)
	{
		txt_userID.sendKeys(UserId);
		txt_password.sendKeys(Password);
	}
	
	public void login() throws InterruptedException
	{
		btn_login.click();
		Thread.sleep(5000);
	}
	

}
