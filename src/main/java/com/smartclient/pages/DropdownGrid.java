package com.smartclient.pages;


import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DropdownGrid extends Utility {
    public DropdownGrid() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(DropdownGrid.class.getName());

    //Locating path of required WebElement of Shopping cart page
    @FindBy(xpath ="//div[@id='isc_EH']//table[@role='presentation']")
    WebElement dropdownItemAscOrder;


    public void clickToSortAscOrder(){
        dropdownItemAscOrder.click();
    }
}





