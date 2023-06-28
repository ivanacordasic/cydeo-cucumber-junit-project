package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CydeoDropdownPage {

    public CydeoDropdownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="month")
    public WebElement monthDropdown;

}
