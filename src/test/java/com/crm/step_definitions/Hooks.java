package com.crm.step_definitions;

import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setupMethod() {

        System.out.println("----> @Bofore: RUNNING BEFORE EACH SCENARIOS");

    }

    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }


}
