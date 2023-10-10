import org.example.models.Student;
import org.example.pages.PracticeFormPage;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticeFormTest extends BaseTest {

    @Test
    void fillUpTheFormTest() throws InterruptedException, AWTException {

        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.createFakeStudent();
        practiceFormPage.fillUpTheForm(student)
                .checkTheStudentDetail(student);



    }
}
