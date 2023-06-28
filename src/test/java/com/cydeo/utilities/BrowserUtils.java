package com.cydeo.utilities;

import com.beust.ah.A;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    /*
    This method will except integer (in seconds) and will execute Thread.sleep method for a given duration
    Arg: int second
     */
    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {

        }
    }


    /*
    This method will iterate through all the browser windows and find the one with a matching url part. After that it will assert that the actual title contains that part as well.
     */
    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle) {

        Set<String> windowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : windowsHandles) {

            if (Driver.getDriver().switchTo().window(each).getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    /*
    This method will verify if the expected title is matching with the actual title
     */
    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }


    /*
    This method will verify if the expected title is contained in the actual title
    */
    public static void verifyTitleContains(String expectedInTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }


    /*
    This method accepts WebElement target, and waits for that WebElement to disappear from the page
     */
    public static void waitForInvisibilityOfElement(WebElement target) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }


    /*
       This method accepts String title, and waits for that Title to contain certain String value
        */
    public static void waitForTitleContains(String title) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(title));
    }

    /*
    This method will store all dropdown menu options into a List<String>
     */

    public static List<String > dropdownOptions_asString(WebElement dropdown){

        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();

        List<String> dropdownOptions_asString = new ArrayList<>();
        for (WebElement each : options) {
            dropdownOptions_asString.add(each.getText());
        }

        return dropdownOptions_asString;

    }


    /*
    This method will get all the options from a dropdown menu on the website and store it into a list of <String>. And then, it will compare this list with the given list.
     */
    public static void verifyDropdownOptionsEqualToListOfStrings(List<String> list, WebElement dropdown) {

        Select select = new Select(dropdown);
        List<WebElement> actualOptions = select.getOptions();

        List<String> actualOption_asString = new ArrayList<>();

        for (WebElement each : actualOptions) {
            actualOption_asString.add(each.getText());
        }

        Assert.assertEquals(list, actualOption_asString);


    }

}
