package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    WebElement adminBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    WebElement jobBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]")
    WebElement jobTitlesBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")
    WebElement addBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    WebElement wait1;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/div/span")
    WebElement wait2;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    WebElement jobTitleField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    WebElement descriptionJobField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    WebElement notesJobField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
    WebElement saveBtn;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[24]/div")
    WebElement jobAdded;



    public AdminPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAdmin(){
        adminBtn.click();
    }
    public void clickJob(){

        jobBtn.click();
    }
    public void clickJobTitles(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(jobTitlesBtn));
        jobTitlesBtn.click();
    }
    public void clickAdd(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addBtn));
        addBtn.click();
    }
    public void setJobTitleName(String jbTitleField){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        jobTitleField.sendKeys(jbTitleField);
    }
    public void setJobDescription(String jbDescrip){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        descriptionJobField.sendKeys(jbDescrip);
    }
    public void setJobNotes(String jbNotes){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        notesJobField.sendKeys(jbNotes);
    }
    public void clickSaveButton(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveBtn.click();
    }
    public boolean savedMsgIsDisplayed(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(wait2));
        boolean savedMessage= jobAdded.isDisplayed();
        return savedMessage;
    }


}
