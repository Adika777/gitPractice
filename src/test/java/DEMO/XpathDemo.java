package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo  extends BaseTest{
    // xpath:
    //1. absolut --> html/body/div/div/div[2]/input....
    //2. relative

    @Test
    void absolutXpathDemo() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstNameInput= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
        firstNameInput.sendKeys("John");
        Thread.sleep(7000);
    }
    @Test
    void relativeXpath(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement lastNameInputFiled= driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputFiled.sendKeys("Doe");

        WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));

        WebElement mobNumberInputFiled = driver.findElement(By.xpath("//*[@id='userNumber']"));

        WebElement registrationFormText = driver.findElement(By.xpath("//*[text()='Student Registration Form']"));

        WebElement contains =driver.findElement(By.xpath("//*[contains(text(),'Student')]"));

        WebElement emailText = driver.findElement(By.xpath("//form/div[2]/div/label"));

        WebElement currentAddress = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]"));

        WebElement parent = driver.findElement(By.xpath("(//*[@id='currentAddress'])[2]/../.."));
    }

    @Test
    void searchXpath(){
        driver.get("https://www.amazon.com/s?k=iphone+15+pro&crid=P7XLSJ6KJWYC&sprefix=iphone+15+pro%2Caps%2C239&ref=nb_sb_noss_1");
        WebElement iphoneProtectedFind = driver.findElement(By.xpath("//span[contains(text(), 'Pelican Protector Series ')]"));
        System.out.println(iphoneProtectedFind.getText());
    }
}
