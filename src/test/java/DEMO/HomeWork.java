package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork {

    @Test
    void homeWorkTest(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        String expectedFirstName = "Mike";
        firstNameInput.sendKeys(expectedFirstName);

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        String expectedLastName = "Tyson";
        lastNameInput.sendKeys(expectedLastName);

        WebElement emailField = driver.findElement(By.id("userEmail"));
        String expectedEmail = "iron.mike@gmail.com";
        emailField.sendKeys(expectedEmail);

        WebElement genderInput = driver.findElement(By.xpath("//input[@id ='gender-radio-1']"));
        genderInput.sendKeys("//input[@id ='gender-radio-1']");
        WebElement genderInput2 = driver.findElement(By.xpath("//input[@id ='gender-radio-2']"));
        WebElement genderInput3 = driver.findElement(By.xpath("//input[@id ='gender-radio-3']"));


        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id ='userNumber']"));
        String expectedMobileNumber= "312448114";
        mobileNumber.sendKeys(expectedMobileNumber);

        WebElement birthday = driver.findElement(By.id("dateOfBirthInput"));
//        String expectedBirth = "30.06.1966";
//        birthday.sendKeys(expectedBirth);

        WebElement subject = driver.findElement(By.xpath("//input[@id ='subjectsInput']"));

        WebElement hobbyCheck = driver.findElement(By.xpath("//input[@id ='hobbies-checkbox-1']"));
        hobbyCheck.sendKeys("//input[@id ='hobbies-checkbox-1']");


        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", currentAddress);
        String expectedAddress = "New York ";
        currentAddress.sendKeys(expectedAddress);



//        driver.close();
//        driver.quit();

    }

}
