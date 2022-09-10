import org.junit.AfterClass;
import org.junit.Before;
import Utilities.DriverManager;

public class BaseTest {
    @Before
    public void setup(){
        DriverManager.getDriver().driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverManager.getDriver().driver.manage().window().maximize();

    }

    @AfterClass
    public static void cleanUp(){
        DriverManager.getDriver().driver.close();

    }

}
