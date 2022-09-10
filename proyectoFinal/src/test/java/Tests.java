import Pages.LoginPage;
import Pages.PimPage;
import Utilities.DriverManager;
import org.junit.Assert;
import org.junit.Test;

public class Tests extends BaseTest{


    @Test
    public void loginSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

        loginPage.setUser("Admin");
        loginPage.setPssw("admin123");
        loginPage.clickLgn();
        Assert.assertTrue(loginPage.verifyLogin());


    }
    @Test
    public void logoutSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);
        PimPage pimPage = new PimPage(DriverManager.getDriver().driver);

        loginPage.setUser("Admin");
        loginPage.setPssw("admin123");
        loginPage.clickLgn();

        pimPage.clickUserTab();
        pimPage.clickLogout();

        Assert.assertTrue(pimPage.verifyLogout());
    }
}
