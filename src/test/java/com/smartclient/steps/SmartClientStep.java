package com.smartclient.steps;

import com.smartclient.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmartClientStep {
    @Given("^I click on tile and filtering$")
    public void iClickOnTileAndFiltering() {
        new HomePage().clickOnIAgreeButton();
        new HomePage().clickOnTileSortAndFiltering();
    }

    @When("^I select animal using letter \"([^\"]*)\"$")
    public void iSelectAnimalUsingLetter(String msg) throws Throwable {
        new HomePage().enterAInAnimalField(msg);
    }

    @And("^I select life span to (\\d+)$")
    public void iSelectLifeSpanTo(int arg) throws InterruptedException {
        new HomePage().draggingSlider();
    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String text) throws InterruptedException {
        new HomePage().selectFromDropDown(text);
    }

    @And("^I select checkbox to ascending$")
    public void iSelectCheckboxToAscending() {
        new HomePage().clickOnCheckBox();
    }

    @Then("^I verify result contain more than (\\d+) items$")
    public void iVerifyResultContainMoreThanItems(int arg0) {
        new HomePage().verifyingResult();
    }

    @Given("^I click on dropdown grid$")
    public void iClickOnDropdownGrid() {
        new HomePage().clickOnIAgreeButton();
        new HomePage().clickOnDropDownGridTab();
    }

    @And("^when I select excercise from the dropdown$")
    public void whenISelectExcerciseFromTheDropdown() {
        new HomePage().clickOnGridDropDownField();

    }

    @Then("^I should able to select Excercise$")
    public void iShouldAbleToSelectExcercise() throws InterruptedException {
        new HomePage().clickOnItemDropDownMenu();

    }
}
