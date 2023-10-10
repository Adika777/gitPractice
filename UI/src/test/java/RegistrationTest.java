import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{



        @Test
        void fillRegistrationTest () throws InterruptedException {
            driver.get("https://demoqa.com/register");
            registrationPage
                    .fillUpFirstName("Mike")
                    .fillUpLastName("Tyson")
                    .createUserName("IronMike")
                    .createPassword("A12345!z");


            Thread.sleep(5000);

        }
    }


