package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JS extends BaseTest{

    //Intefaces в Selenium
    //1. Webelement
    //2. Webdriver
    //3. JS ecrevutor

    @Test
    void demo1() throws InterruptedException {
        //driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location=' https://demoqa.com/text-box'");

        WebElement fullName = driver.findElement(By.id("userName"));

        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", fullName, "border: 2px solid red");
        fullName.sendKeys("John Doe");
        Thread.sleep(5000);

        WebElement email = driver.findElement(By.id("userEmail"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", email, "border: 2px solid red");
        email.sendKeys("john@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", currentAddress, "border: 2px solid red");
        currentAddress.sendKeys("Mira 123");

        WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", permanentAddress, "border: 2px solid red");
        permanentAddress.sendKeys("wall 123");

        WebElement submit = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", submit, "border: 2px solid red");
        js.executeScript("arguments[0].click()",submit);
        Thread.sleep(8000);
    }
}
