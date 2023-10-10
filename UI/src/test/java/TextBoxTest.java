import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    void fillUpTheFormTest(){
        //
        driver.get("");  //ссылка на страничку
        textBoxPage.fillUpTheCurrentAdd("dasdas");
    }
}
