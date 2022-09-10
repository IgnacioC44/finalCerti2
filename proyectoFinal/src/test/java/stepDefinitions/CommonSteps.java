package stepDefinitions;

import Pages.LoginPage;
import Utilities.DriverManager;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonSteps {
    WebDriver driver;

    @Given("Im in Orange web page")
    public void goToOrangePage() throws InterruptedException {
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverManager.getDriver().driver.manage().window().maximize();
        LoginPage loginPage=new LoginPage(DriverManager.getDriver().driver);
        Assert.assertTrue(loginPage.loginButtonDisplayed());


    }
}
