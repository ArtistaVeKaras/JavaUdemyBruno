package steps;


import org.openqa.selenium.By.ByName;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory{



	@Given("^User navigates to GitHub website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		getDriver().get("https://github.com/login");
	}


	@Given("^User enter a valid username$")
	public void user_enter_a_valid_username() throws Throwable {
		getDriver().findElement(ByName.name("login")).sendKeys("claudiooartista@hotmail.co.uk");

	}
	
	//Login with RegEx
	@Given("^User enter a \"([^\"]*)\" password$")
	public void user_enter_a_password(String password) throws Throwable {
		getDriver().findElement(ByName.name("password")).sendKeys(password);
	    
	}

	@Given("^User enter a valid password$")
	public void user_enter_a_valid_password() throws Throwable {
		getDriver().findElement(ByName.name("password")).sendKeys("hip-poptuga01");	

	}

	@When("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		getDriver().findElement(ByName.name("commit")).click();

	}

	@Then("^User should be taken to the successful loginpage$")
	public void user_should_be_taken_to_the_successful_loginpage() throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals(getDriver().getTitle(), "GitHub");
		getDriver().quit();
	}
}
