package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//Ignacio Cossio 58754
public class LoginPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userNameField;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
    WebElement loginBtn;
    @FindBy(className = "oxd-brand-banner")
    WebElement oxdBanner;
    @FindBy(className = "orangehrm-login-branding")
    WebElement loginBanner;
    @FindBy(xpath = "//*[text()='Invalid credentials']")
    WebElement errorMessage;







    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public boolean loginButtonDisplayed(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        boolean loginButtonDisplayed= loginBtn.isDisplayed();
        return loginButtonDisplayed;
    }
    public void setUser(String username){
        userNameField.sendKeys(username);
    }
    public void setPssw(String password){
        passwordField.sendKeys(password);
    }
    public void clickLgn(){
        loginBtn.click();
    }

    public boolean verifyLogin(){

        boolean loginSuccessBanner = oxdBanner.isDisplayed();
        return loginSuccessBanner;
    }
    public boolean verifyErrorMsg(){

        boolean errorMsg = errorMessage.isDisplayed();
        return errorMsg;
    }


}
