package org.example.pages;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TextBoxPage extends BasePage {
    // Page Object Model
    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    public TextBoxPage fillUpTheFullName(String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;
    }

    public TextBoxPage fillUpTheEmail(String email) {
        elementActions.writeText(userEmailInput, email);
        return this;
    }

    public TextBoxPage fillUpTheCurrentAdd(String currentAdd) {
        elementActions.writeText(currentAddressInput, currentAdd);
        return this;
    }

    public TextBoxPage fillUpThePermanentAdd(String permanent) {
        elementActions.writeText(permanentAddressInput, permanent);
        return this;
    }

    public TextBoxPage clickTheButton() {
        elementActions.waitButtonToBeClickable(submitBtn)
                .scrollToElement(submitBtn)
                .clickTheButton(submitBtn);
//       elementActions.clickTheButton(submitBtn);
//        elementActions.scrollToElement(submitBtn);
        return this;
    }
    WebDriver driver;
    @Test
    public void testTextBoxPage (){
        driver = Driver.getDriver();
        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpTheFullName("Adil").fillUpTheEmail("adil12@mail.ru").fillUpTheCurrentAdd("Bishkek").fillUpThePermanentAdd("Bishkek").clickTheButton();

    }
}
