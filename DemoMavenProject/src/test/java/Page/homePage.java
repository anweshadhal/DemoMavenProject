package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class homePage {

	@FindBy(xpath="//*[@class=\"x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft\"]")
	WebElement homePagevalidation;
	
	WebDriver driver;
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void homePageValidation()
	{
		String homePage=driver.getTitle();
		System.out.println(homePage);
		//Assert.assertEquals("Landed on home page", "Try Another Way", homePage);
		//Assert.assertEquals("Facebook", homePage);
	}
}
