import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverHelpers;

public class Hooks {


    private DriverHelpers driverHelpers = new DriverHelpers();

    @Before
    public void setup(){
        driverHelpers.openBrowser();
        driverHelpers.maximizeBrowser();
        driverHelpers.getUrl("https://www.argos.co.uk/");
        driverHelpers.impWait();
        driverHelpers.deleteCookies();
    }

    @After
    public void tearDown(){
        driverHelpers.closeBrowser();
    }
}
