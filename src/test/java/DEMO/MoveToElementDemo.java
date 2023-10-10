package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementDemo extends BaseTest{

    @Test
    void  demo1234(){
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameInputField = driver.findElement(By.id("userName"));

        String expectedFullName = "John Doe";

        fullNameInputField.sendKeys(expectedFullName); // передаем данные в поле

        WebElement emailField = driver.findElement(By.id("userEmail"));

        String expectedEmail = "john@gmail.com";

        emailField.sendKeys(expectedEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));

        String expectedCurrentAddress = "Bishkek";

        currentAddress.sendKeys(expectedCurrentAddress);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        String expectedPermanentAddress = "New York";

        permanentAddress.sendKeys(expectedPermanentAddress);

        WebElement submitBtn = driver.findElement(By.id("submit"));

        Actions actions = new Actions(driver);

        actions.moveToElement(submitBtn).perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();


    }
}
