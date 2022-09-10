package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PimPage {
    WebDriver driver;
    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userTab;
    @FindBy(xpath = "//*[text()='Logout']")
    WebElement logoutBtn;
    @FindBy(className = "orangehrm-login-branding")
    WebElement loginBanner;
    @FindBy(xpath = "//*[text()='Configuration ']")
    WebElement configurationTab;
    @FindBy(xpath = "//*[text()='Optional Fields']")
    WebElement optionalFieldsBtn;
    @FindBy(xpath = "//*[text()='Optional Fields']")
    WebElement optionalFieldsTittle;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")
    WebElement recordsFound;



    public PimPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickUserTab(){
        userTab.click();
    }
    public void clickLogout(){
        logoutBtn.click();
    }
    public boolean verifyLogout(){
        boolean logoutSuccessBanner = loginBanner.isDisplayed();
        return logoutSuccessBanner;
    }
    public void clickConfig(){
        configurationTab.click();
    }
    public void clickOptionalField(){
        optionalFieldsBtn.click();
    }
    public boolean verifyOptionalFieldsTittle(){
        boolean optionalFieldsTit = optionalFieldsTittle.isDisplayed();
        return optionalFieldsTit;
    }
    public boolean verifyEmployees(String employee){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(recordsFound));
        WebElement employeeName= driver.findElement(By.xpath("//div[contains(text(),'"+employee+"')]"));
        return employeeName.isDisplayed();
    }
    public boolean configTabIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(configurationTab));
        boolean configTabb = configurationTab.isDisplayed();
        return configTabb;
    }


}
