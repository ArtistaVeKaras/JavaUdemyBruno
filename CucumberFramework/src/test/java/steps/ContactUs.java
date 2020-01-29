package steps;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactUs{
	
	
	WebDriver driver;
	@Before
	public void setUp1() {
		System.setProperty("webdriver.chrome.driver","/home/claudio/Downloads/Drivers/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);

	}
	
	@Given("^I access webdriveruniversity$")
	public void i_access_webdriveruniversity() throws Throwable {
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	}
	
	@Given("^I click on the contact form$")
	public void i_click_on_the_contact_form() throws Throwable {
		driver.findElement(ByXPath.xpath("/html/body/div[1]/div/div[2]/div[1]/a/div/div[1]/h1")).click();
		Thread.sleep(5000);
	}

	@Given("^I enter the firstname$")
	public void i_enter_the_username() throws Throwable {
		driver.findElement(ByXPath.xpath("//*[@id=\"contact_form\"]/input[1]")).sendKeys("claudio");

	}

	@Given("^I enter the lastname$")
	public void i_enter_the_password() throws Throwable {
	  driver.findElement(ByName.name("last_name")).sendKeys("Correia");
	}

	@Given("^I enter an email address$")
	public void i_enter_an_email_address() throws Throwable {
		driver.findElement(ByXPath.xpath("//*[@id=\"contact_form\"]/input[3]")).sendKeys("claudio.corr@outlook.com");
	    
	}

	@Given("^I enter comments$")
	public void i_enter_comments(DataTable comments) throws Throwable {
		List<List<String>> data = comments.raw();
		driver.findElement(ByCssSelector.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(0)+"\n"); //comment one 
		driver.findElement(ByCssSelector.cssSelector("textarea[name='message']")).sendKeys(data.get(0).get(1)); //comment two

	}

	@Given("^I click the submit button$")
	public void i_click_the_submit_button() throws Throwable {
	    driver.findElement(ByCssSelector.cssSelector("input[value=SUBMIT]")).click();
	}

	@Then("^The information should successfully be subimiited via the contact us form$")
	public void the_information_should_successfully_be_subimiited_via_the_contact_us_form() throws Throwable {
	    System.out.println("Not done yet");
	}
}
