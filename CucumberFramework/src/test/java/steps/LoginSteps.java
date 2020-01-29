package steps;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/home/claudio/Downloads/Drivers/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

	}

	@Given("^User navigates to GitHub website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("https://github.com/login");
	}


	@Given("^User enter a valid username$")
	public void user_enter_a_valid_username() throws Throwable {
		driver.findElement(ByName.name("login")).sendKeys("claudiooartista@hotmail.co.uk");

	}
	
	//Login with RegEx
	@Given("^User enter a \"([^\"]*)\" password$")
	public void user_enter_a_password(String password) throws Throwable {
		driver.findElement(ByName.name("password")).sendKeys(password);
	    
	}

	@Given("^User enter a valid password$")
	public void user_enter_a_valid_password() throws Throwable {
		driver.findElement(ByName.name("password")).sendKeys("hip-poptuga01");	

	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		driver.findElement(ByName.name("commit")).click();

	}

	@Then("^User should be taken to the successful loginpage$")
	public void user_should_be_taken_to_the_successful_loginpage() throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "GitHub");
		driver.quit();
	}
}
