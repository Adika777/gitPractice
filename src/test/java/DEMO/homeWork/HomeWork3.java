package DEMO.homeWork;

import DEMO.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork3  {
    @Test
    void homeWork() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement FirstInputName = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstInputName.sendKeys("Adil");

        WebElement LastInputName = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastInputName.sendKeys("Emilbekov");

        WebElement femaleBtn = driver.findElement(By.xpath("//input[@value='Female']"));
        femaleBtn.click();

        WebElement yearsBtn = driver.findElement(By.xpath("//input[@value='1']"));
        yearsBtn.click();

        WebElement dataBirth = driver.findElement(By.xpath("(//input[@style='width:95%;padding:4px 0px 4px 5px;margin:4px 0px'])[3]"));
        dataBirth.sendKeys("12.04.1999");

        WebElement professionInput = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
        professionInput.click();

       WebElement fileBtn = driver.findElement(By.xpath("//input[@name='photo']"));
        fileBtn.sendKeys("C:\\Users\\User\\OneDrive\\Рабочий стол\\904532688.jpg");

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileBtn);

        WebElement seleniumBtn = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
        seleniumBtn.click();


        WebElement continentChoseBtn = driver.findElement(By.xpath("//select[@name='continents']/option[4]"));
        continentChoseBtn.click();

        WebElement anyBtn = driver.findElement(By.xpath("//select[@name='selenium_commands']/option[3]"));
        anyBtn.click();

        WebElement submitBtn = driver.findElement(By.cssSelector("button[name^='submit']"));

        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", submitBtn, "border: 2px solid red");

        driver.close();
        driver.quit();

        Thread.sleep(7000);


        // submitBtn.click();

    }

}