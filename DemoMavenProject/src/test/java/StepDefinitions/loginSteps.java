package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.homePage;
import Page.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	WebDriver driver;
	
	loginPage loginpage;
	homePage homepage;
	
	@Before(order=1)
	public void browserSetup()
	{
		System.out.println("Inside Before Hook");
		String relativeaddress=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", relativeaddress+"/src/test/resources/Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@Before(order=0)
	public void beforeOrderTest()
	{
		System.out.println("Inside before which has order 0");
	}
	
	@BeforeStep
	public void beforeSteptest()
	{
		System.out.println("Before step test");
	}
	
	@After
	public void closeBrowser()
	{
		System.out.println("Inside After Hook");
		driver.close();
		driver.quit();
	}
	
	@AfterStep
	public void afterSteptest()
	{
		System.out.println("After step test");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	
	    System.out.println("Inside Given tag");
	    driver.get("https://www.facebook.com/");
	    
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userId, String password) {
		System.out.println("Inside When tag");
		loginpage= new loginPage(driver);
		loginpage.enterUserPass(userId, password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("Inside And tag");
		loginpage= new loginPage(driver);
		loginpage.login();
	}

	@Then("user is naviagted to the home page")
	public void user_is_naviagted_to_the_home_page() {
		System.out.println("Inside Then tag");
		homepage = new homePage(driver);
		homepage.homePageValidation();
		System.out.println("Home page validation successful");
	}

}
