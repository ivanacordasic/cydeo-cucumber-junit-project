package com.cydeo.step_definitions;

import com.cydeo.pages.CydeoDropdownPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CydeoDropdown_StepDefinition {

    CydeoDropdownPage cydeoDropdownPage = new CydeoDropdownPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
//
//        Select select = new Select(cydeoDropdownPage.monthDropdown);
//        List<WebElement> monthsOptions = select.getOptions();
//
//        List<String > actualMonthOptions_asString = new ArrayList<>();
//
//        for (WebElement each : monthsOptions) {
//            actualMonthOptions_asString.add(each.getText());
//        }
//
//        Assert.assertEquals(months, actualMonthOptions_asString);


      //  BrowserUtils.verifyDropdownOptionsEqualToListOfStrings(months, cydeoDropdownPage.monthDropdown);

        List<String>actualMonthOptions_asString = BrowserUtils.dropdownOptions_asString(cydeoDropdownPage.monthDropdown);

        Assert.assertEquals(months, actualMonthOptions_asString);

    }


}
