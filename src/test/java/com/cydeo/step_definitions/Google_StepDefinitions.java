package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://google.com");

    }


    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();

    }


    @When("user enters {word} in the search box and press Enter")
    public void user_enters_in_the_search_box(String word) {
        googleSearchPage.searchBar.sendKeys(word + Keys.ENTER);
    }

    @Then("user should be directed to a new page with {word} – Google Search title")
    public void user_should_be_directed_to_a_new_page_with_title(String word) {
        BrowserUtils.verifyTitle(word+" - Google Search");
    }

}
