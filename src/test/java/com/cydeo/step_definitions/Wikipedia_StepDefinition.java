package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaResultPage;
import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinition {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    WikipediaResultPage wikipediaResultPage = new WikipediaResultPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
       wikipediaSearchPage.searchBar.sendKeys(string);
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        wikipediaSearchPage.searchButton.click();
    }

    @Then("user sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {
        BrowserUtils.verifyTitleContains(string);
    }

    @Then("user sees {string} in the main header")
    public void user_sees_in_the_main_header(String string) {
        Assert.assertTrue(wikipediaResultPage.mainHeader.getText().equals(string));
    }

    @Then("user sees {string} in the image header")
    public void user_sees_in_the_image_header(String string) {
        Assert.assertTrue(wikipediaResultPage.imageHeader.getText().equals(string));
    }


}
