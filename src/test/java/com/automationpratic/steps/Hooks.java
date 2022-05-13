package com.automationpratic.steps;

import com.automationpratice.communs.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeTest(){
        DriverFactory.getInstance().setCurrentDriver(DriverManagerType.CHROME);
        DriverFactory.getInstance().getCurrentDriver().get("http://automationpractice.com/index.php");
    }

    @After
    public void aftertTest(Scenario cenario){
        byte[] screenshot = ((TakesScreenshot) DriverFactory.getInstance().getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
        cenario.attach(screenshot, "image/png", cenario.getName());
        DriverFactory.getInstance().getCurrentDriver().quit();
    }


}
