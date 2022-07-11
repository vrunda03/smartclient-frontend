package com.smartclient.pages;


import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Locating path of required WebElement of Shopping cart page

    @CacheLookup
    @FindBy(xpath = "//div[@id='popupPPC']/a[2]")
    WebElement iAgree;

    @CacheLookup
    @FindBy(xpath = "//input[@name='commonName']")
    WebElement animalSearchField;

    @CacheLookup
    @FindBy(xpath = "//div[@eventproxy='isc_SliderItem_3_slider_track']")
    WebElement sliderTrackLine;

    @CacheLookup
    @FindBy(xpath = "//td[@id='isc_SideNavTree_0_valueCell8']")
    WebElement gridTab;

    @CacheLookup
    @FindBy(xpath = "//div[@eventproxy='isc_SliderItem_3_slider_thumb']")
    WebElement sliderLine;

    @CacheLookup
    @FindBy(xpath = "//*[@eventproxy='sortForm']//*[@class='selectItemPickerIcon']")
    WebElement sortByDropDownMenu;

    @CacheLookup
    @FindBy(xpath = "//*[@class='pickListMenuBody']/div/table/tbody/tr[2]")
    WebElement animalLifespan;

    @CacheLookup
    @FindBy(xpath = "//*[@class='labelAnchor']/span")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//td[@id='isc_SideNavTree_0_valueCell16']")
    WebElement dropDownGridMenu;

    @CacheLookup
    @FindBy(xpath = "//*[@class='homeInterfacePage']//*[@class='normal'][2]//span[@role='button']//span[@class='comboBoxItemPicker']")
    WebElement itemDropDownMenu;

    @CacheLookup
    @FindBy(xpath = "//*[@role='treeitem']//*[contains(text(),'Dropdown Grid')]")
    WebElement gridDropDownMenu;


    @CacheLookup
    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]")
    WebElement sideScrolBar;

    @CacheLookup
    @FindBy(xpath = "//*[@role='listbox']//div[@class = 'vScrollThumb']")
    WebElement scroll_1;

    @CacheLookup
    @FindBy(xpath = "//*[@class='pickListCell']//*[text()='Exercise Book Sewn 240 Page']")
    WebElement items_1;

    @CacheLookup
    @FindBy(xpath = "//*[@class='selectItemLiteControl']//*[text()='Exercise Book Sewn 240 Page']")
    WebElement excercise;

    @CacheLookup
    @FindBy(xpath = "//*[@eventproxy='isc_SideNavTree_0_body_vscroll_thumb']")
    WebElement scrollMainBar;

    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Nested Grid')]")
    WebElement featureNestedGrid;

    public void clickOnIAgreeButton() {
        clickOnElement(iAgree);

    }

    public void clickOnNestedGridTab() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on Nested Grid : " + featureNestedGrid.toString());
        featureNestedGrid.click();
    }


    public void clickOnTileSortAndFiltering() {
        clickOnElement(gridTab);
    }

    public void enterAInAnimalField(String text) throws InterruptedException {
        sendTextToElement(animalSearchField, "a");
    }

    public void draggingSlider() throws InterruptedException {
        Actions actions = new Actions(driver);
        int width = sliderLine.getSize().width;
        System.out.println(width);
        actions.dragAndDropBy(sliderTrackLine, 22, 0).build().perform();

        Actions actions1 = new Actions(driver);
        actions1.dragAndDropBy(sideScrolBar, 0, 90).build().perform();

    }

    public void selectFromDropDown(String text) throws InterruptedException {
        waitForElementWithFluentWait(By.xpath("//*[@eventproxy='sortForm']//*[@class='selectItemPickerIcon']"), 10, 2);
        clickOnElement(sortByDropDownMenu);
        Thread.sleep(4000);
        clickOnElement(animalLifespan);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }
    public void clickOnItemDropDownMenu() throws InterruptedException {
        waitUntilVisibilityOfElementLocated(By.xpath("//*[@class='homeInterfacePage']//*[@class='normal'][2]//span[@role='button']//span[@class='comboBoxItemPicker']"),10);
        clickOnElement(itemDropDownMenu);

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(scroll_1, 0, 25).build().perform();

        waitUntilVisibilityOfElementLocated(By.xpath("//*[@class='pickListCell']//*[text()='Exercise Book Sewn 240 Page']"),10);
        mouseHoverToElementAndClick(items_1);
    }


    public void verifyingResult() {
        List<WebElement> names = (List<WebElement>) driver.findElements(By.xpath("//*[@class='simpleTile']"));
        int actualQuantity = names.size();
        System.out.println(actualQuantity);
        int expectedQuantity = 12;
        Assert.assertNotEquals(actualQuantity, expectedQuantity);
    }

    public void clickOnGridDropDownField() {
        clickOnElement(gridDropDownMenu);
    }


    public void clickOnDropDownGridTab() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(scrollMainBar, 0, 25).build().perform();
        clickOnElement(dropDownGridMenu);
    }


}





