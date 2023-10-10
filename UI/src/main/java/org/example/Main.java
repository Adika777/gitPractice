package org.example;

import org.example.driver.ChromeWebDriver;
import org.example.driver.Driver;
import org.example.driver.EdgeWebDriver;
import org.example.helper.AlertHelper;
import org.example.helper.ScreenShotMethods;
import org.example.models.Student;

import org.example.pages.PracticeFormPage;

import org.example.pages.TextBoxPage;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.time.Duration;

public class Main {

    Student john = new Student("John", "Doe", "john231@gmail.com", "+996555050000", "Bishkek312");

    WebDriver driver;


    @BeforeClass
    public void setIp() {
        driver = Driver.getDriver();
    }

    @Test
    void test1() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/automation-practice-form");

        FakeDataProvider FakeDataProvider = new FakeDataProvider();
        Student student = new Student();
        student.setFirstName("Adil");
        student.setLastName("Emilbekov");
        student.setEmail("adil@gmail.com");
        student.setCurrentAddress("Bishkek");
        student.setPhoneNumber("9965550055");
        PracticeFormPage practiceFormPages = new PracticeFormPage();
        practiceFormPages.fillUpTheForm(student).checkTheStudentDetail(student);

    }

    @Test
    void test12() throws InterruptedException, IOException {
        // Алерт - предупреждение ( сплывающие окно на страничке)
        ScreenShotMethods screenShotMethods = new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();  //переключается на алерт
        Thread.sleep(2000);
        alert.accept();  //дает согласие на этот алерт

        screenShotMethods.takeScreenShot();

        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5)); //ждем 5 сек
        wait.until(ExpectedConditions.alertIsPresent()); // ждать пока алерт выйдет
        alert.accept(); // согласие на  алерт

        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss(); //для отклонения условия (нажимает отмена или нет)

        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("Adil");
        alert.accept();

    }

    @Test
    void testToAlert() {
        AlertHelper alertHelper = new AlertHelper();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Adil");

    }

    @Test
    void test14() {
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        WebElement div = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());


    }

    @Test
    void test15() {
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");  //родительский фрейм
        driver.switchTo().frame(0);  // фрейм ребенка (дочерний)

        System.out.println((driver.findElement(By.tagName("p")).getText()));

        driver.switchTo().parentFrame(); // возвращается на родителя
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent(); // возвращается в начало на самый главный html

    }

    @Test
    void test16() {
        driver.get("https://www.google.com/");
    }


    public static void main(String[] args) {


        WebDriver driver = ChromeWebDriver.loadChromeDriver();
        driver.get("https://demoqa.com/text-box");

        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpTheFullName("Mike Tyson")
                .fillUpTheEmail("IronMike@gmail.com")
                .fillUpTheCurrentAdd("Boston")
                .fillUpThePermanentAdd("Texas")
                .clickTheButton();
    }
}









