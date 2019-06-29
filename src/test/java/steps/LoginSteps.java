package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverProvider;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
;

import static constants.Constants.*;

public class LoginSteps extends BasePage {
    @FindBy(id = "identifierId")
    private WebElement emailField;

    @FindBy(xpath = "//span[@class='RveJvd snByac']")
    private WebElement nextButton;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//a[@href ='#inbox']")
    private WebElement inbox;

    @Given("^I open gmail page$")
    public void openGmailPage() {
        driver.get(URL);
    }

    @When("^I provide username as \"([^\"]*)\"$")
    public void typeUserName() {
        emailField.sendKeys("username");
    }

    @When("^I click the next button$")
    public void clickNextButton() {
        nextButton.click();
    }

    @When("^I provide password as \"([^\"]*)\"$")
    public void typePassword() {
       passwordField.sendKeys("password");
    }

    @When("^I click again the next button$")
    public void clicAgainkNextButton() {
       nextButton.click();
    }

    @Then("^it is opened main page$")
    public void getLogoMainPage(){
        try {
           Assert.assertEquals(inbox.getAttribute("title"),"Почта");
        } finally {
            DriverProvider.removeDriver();
        }
    }
}

