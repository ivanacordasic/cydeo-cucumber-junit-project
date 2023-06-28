package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Bing_StepDefinitions {

    BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }

    @When("user enters orange in the search box and presses enter")
    public void user_enters_orange_in_the_search_box_and_presses_enter() {
        BrowserUtils.sleep(2);
        bingSearchPage.searchBar.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user should be directed to a new page with title orange - Search")
    public void user_should_be_directed_to_a_new_page_with_title_orange_search() {
        BrowserUtils.verifyTitle("orange - Search");
    }

    @When("user enters {string} in the search box and presses enter")
    public void userEntersInTheSearchBoxAndPressesEnter(String searchKey) {
        BrowserUtils.sleep(2);
        bingSearchPage.searchBar.sendKeys(searchKey + Keys.ENTER);
    }

    @Then("user should be directed to a new page with title {string}")
    public void userShouldBeDirectedToANewPageWithTitleSearch(String expectedTitle) {
       BrowserUtils.verifyTitle(expectedTitle);
      //  BrowserUtils.verifyTitleContains(expectedTitle);
    }
}
