import org.example.driver.Driver;
import org.example.helper.ElementActions;
import org.example.pages.PracticeFormPage;
import org.example.pages.RegistrationPage;
import org.example.pages.TextBoxPage;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;

    public PracticeFormPage practiceFormPage;

    public FakeDataProvider fakeDataProvider;

    public RegistrationPage registrationPage;

//public ElementActions elementActions;
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        textBoxPage = new TextBoxPage();
        practiceFormPage = new PracticeFormPage();
        fakeDataProvider = new FakeDataProvider();
       // elementActions = new ElementActions();

        registrationPage = new RegistrationPage();



    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        Driver.closeDriver();
    }
}
