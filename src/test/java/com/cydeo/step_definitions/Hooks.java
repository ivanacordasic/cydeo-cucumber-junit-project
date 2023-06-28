package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import javax.swing.plaf.PanelUI;

/*
In this class we will be able to create PRE and POST definitions for ALL of the SCENARIOS and STEPS.
 */
public class Hooks {

    // import @Before coming from io.cucumber.java
   // @Before (order = 1)
    public void setupMethod(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    //@Before (value = "@login", order = 2)  // you can use this for @login tags
    public void login_scenario_before(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

   // @After
    public void tearDownMethod1(){
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
    }

   // @BeforeStep
    public void setupStep(){
        System.out.println("---> @BeforeStep : RUNNING BEFORE EACH STEP");
    }

   // @AfterStep
    public void tearDownStep(){
        System.out.println("---> @AfterStep : RUNNING AFTER EACH STEP");
    }

// runs after EVERY SCENARIO in the project
    @After
    public void tearDownMethod(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();

    }


}
