package stepDefinitions;

import Pages.LoginPage;
import Pages.PimPage;
import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
    LoginPage loginPage=new LoginPage(DriverManager.getDriver().driver);
    PimPage pimPage=new PimPage(DriverManager.getDriver().driver);

    @Given("I set the username field with {string}")
    public void setUsername(String userName){
        loginPage.setUser(userName);
    }
    @And("I set the password field with {string}")
    public void setPassword(String psswrd){
        loginPage.setPssw(psswrd);
    }
    @When("I click in login button")
    public void clickLoginBtn(){ loginPage.clickLgn(); }
    @Then("The Orange banner should be displayed")
    public void bannerDisplayed(){
        Assert.assertTrue(loginPage.verifyLogin());
    }
    @Then("The error message should be displayed")
    public void errorMessageDisplayed(){
        Assert.assertTrue(loginPage.verifyErrorMsg());
    }
}
