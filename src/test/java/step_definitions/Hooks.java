package step_definitions;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import base.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.HomePage;
import pages.LoginPage;

public class Hooks extends Base {
	
	@Before
	public void navigateToEventsPage() throws IOException {
		
		initializeDriver();
		
		LoginPage page1 = new LoginPage(driver);
		
		page1.login(prop.getProperty("username_event_manager"), prop.getProperty("password_event_manager"));
		
		log.info("Logged in successfully");
		
		HomePage page2 = new HomePage(driver);
		page2.events().click();
		
		log.info("Navigated to Events Page successfully");
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
            try {
                File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/src/main/java/screenshots/"+scenario.getName()+"screenshot.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		closeDriver();
		log.info("Browser is closed");
	}

}
