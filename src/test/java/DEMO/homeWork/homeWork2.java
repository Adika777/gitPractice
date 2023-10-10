package DEMO.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class homeWork2 {
    @Test
    void homeWorkTest2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://nambafood.kg/nani");

        WebElement salatKrevetki = driver.findElement(By.xpath("/html/body/main/section[2]/div/span/div/div/div[2]/div[2]/div[2]"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mamparInput1);
        salatKrevetki.click();
        salatKrevetki.click();
        WebElement krevetkiOrder = driver.findElement(By.xpath("/html/body/main/section[2]/div/span/div/div/div[2]/button"));
        krevetkiOrder.click();

        WebElement grecheskyiSalat = driver.findElement(By.xpath("/html/body/main/section[2]/div/span/div/div[3]/div[2]/div[2]/div[2]"));
        grecheskyiSalat.click();
        grecheskyiSalat.click();
        WebElement grecheskyiOrder = driver.findElement(By.xpath("/html/body/main/section[2]/div/span/div/div[3]/div[2]/button"));
        grecheskyiOrder.click();

        WebElement kompotInput = driver.findElement(By.xpath("//div[@class='card--item']/div[@data-item-id='320242']/button"));
//        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kompotInput);
//        //((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", kompotInput);
        kompotInput.click();

        WebElement zakazInput = driver.findElement(By.id("cart"));
        zakazInput.click();

        WebElement checkout = driver.findElement(By.xpath("//button[@class='order--btn order--access']"));
        checkout.click();


        driver.close();
        driver.quit();

        Thread.sleep(7000);

    }
}
