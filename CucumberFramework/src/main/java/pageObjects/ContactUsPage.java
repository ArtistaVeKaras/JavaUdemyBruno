package pageObjects;

import java.io.IOException;
import java.util.List;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import cucumber.api.DataTable;
import org.junit.Assert;

public class ContactUsPage extends BasePage{

	public @FindBy(name = "first_name") WebElement textField_FirstName;
	public @FindBy(name = "last_name") WebElement textField_Last_Name;
	public @FindBy(name = "email") WebElement textField_Email;
	public @FindBy(xpath = "//*[@id=\"contact_form\"]/textarea") WebElement textField_Comment;
	public @FindBy(xpath = "//*[@id=\"form_buttons\"]/input[2]") WebElement textField_SubmitButton;
	public @FindBy(xpath = "") WebElement validationMessagElement;

	public ContactUsPage() throws IOException {
		super();
	}
	
	public ContactUsPage navigateContactUsPages() throws Exception {
		getDriver().get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		return contactpage;
		
	}

	public ContactUsPage enterFirstName() throws Exception {
		sendKeysToWebElement(textField_FirstName, "Claudio");
		return contactpage;
		
	}
	public ContactUsPage enterLastName(DataTable dataTable, int row, int colum) throws Exception{
		<List<List<String>>  data = dataTable.raw();
		sendKeysToWebElement(textField_Last_Name, data.get(row).get(colum));
		sendKeysToWebElement(textField_FirstName, "Akira");
		return contactpage;

	}
	public ContactUsPage enterEmailName() throws Exception {	
		sendKeysToWebElement(textField_Last_Name, "Correia@gmail.com");
		return contactpage;

	}
	public ContactUsPage enterComment(DataTable dataTable, int row, int colum) {
		<List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textField_Comment, data.get(row).get(colum));
		return contactpage;

	}
	public ContactUsPage clickSubmitButton() {
		WaitUntilWebElementIsVisible(textField_SubmitButton);
		return contactpage;
	
	public ContactUsPage ValidationOfContactUsPage() {
		WebElement thankyoumessagElement = getDriver().findElement(ByXPath.xpath(""));
		Assert.assertEquals("thankyouforyourmessage!", thankyoumessagElement.getText().toLowerCase().replace("[( , replacement)0-9]", ""));
		return contactpage;
		
	}

}
