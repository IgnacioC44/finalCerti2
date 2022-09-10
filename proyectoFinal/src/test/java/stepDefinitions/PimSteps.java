package stepDefinitions;

import Pages.PimPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PimSteps {
    WebDriver driver;
    PimPage pimPage=new PimPage(DriverManager.getDriver().driver);

    @And("I click in user dropdown tab")
    public void expandUserTab(){
        pimPage.clickUserTab();
    }
    @When("I click in logout button")
    public void clickLogoutBtn(){
        pimPage.clickLogout();
    }
    @Then("Orange login banner should be displayed")
    public void verifyLogoutSuccess(){
        Assert.assertTrue(pimPage.verifyLogout());
    }
    @And("I click in configuration dropdown tab")
    public void clickConfigDropdown(){
        pimPage.clickConfig();
    }
    @When("I click in optional fields button")
    public void clickOptionalFields(){
        pimPage.clickOptionalField();
    }
    @Then("Optional fields window will be displayed")
    public void verifyOptionalFieldsWin(){
        Assert.assertTrue(pimPage.verifyOptionalFieldsTittle());
    }
    @Then("Employee name {string} is displayed")
    public void verifyEmployeeNames(String employee) {
        Assert.assertTrue(pimPage.verifyEmployees(employee));
    }

}
