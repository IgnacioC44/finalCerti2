package stepDefinitions;

import Pages.AdminPage;
import Utilities.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdminSteps {
    WebDriver driver;
    AdminPage adminPage=new AdminPage(DriverManager.getDriver().driver);

    @And("I click in Admin button")
    public void clickAdminBtn(){
        adminPage.clickAdmin();
    }
    @And("I click in Job tab")
    public void clickJobBtn()   {
        System.out.println("yes");
        adminPage.clickJob();
    }
    @And("I click in Job Titles button")
    public void clickJobTitlesBtn(){
        System.out.println("yes");
        adminPage.clickJobTitles();
    }
    @And("I click in +Add button")
    public void clickAddBtn(){

        adminPage.clickAdd();
    }
    @And("I fill the job title information with")
    public void fillJobTitleFields(DataTable jbFields) {
        List<String> data = jbFields.transpose().asList(String.class);
        adminPage.setJobTitleName(data.get(0));
        adminPage.setJobDescription(data.get(1));
        adminPage.setJobNotes(data.get(2));
    }
    @When("I click in save button")
    public void clickSaveBtn(){
        adminPage.clickSaveButton();
    }
    @Then("A successfully saved message shows and the job is successfully saved")
    public void verifyJob(){
        Assert.assertTrue(adminPage.savedMsgIsDisplayed());
    }
}
