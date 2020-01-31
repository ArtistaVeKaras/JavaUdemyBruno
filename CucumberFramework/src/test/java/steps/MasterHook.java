package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHook extends DriverFactory{
	
	@Before
	public void setup() throws Exception {
		driver = getDriver();
	}

	
	@After
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
}
