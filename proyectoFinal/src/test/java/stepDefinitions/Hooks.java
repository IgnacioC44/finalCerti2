package stepDefinitions;

import Pages.PimPage;
import Utilities.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @After("@NeedLogout")
    public void afterScenario(){
        PimPage pimPage=new PimPage(DriverManager.getDriver().driver);
        pimPage.clickUserTab();
        pimPage.clickLogout();
        System.out.println("AfterHook");

    }
    @AfterAll
    public static void afterScenarios(){
        DriverManager.getDriver().driver.close();
    }
}
