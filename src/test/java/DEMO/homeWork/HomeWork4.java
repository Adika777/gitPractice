package DEMO.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeWork4 {

    @Test
    void homeWork() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/checkbox");

        Actions actions=new Actions((driver));


//        WebElement mainItem2 = driver.findElement(By.linkText("Main Item 2"));
//        mainItem2.click();
//
//        WebElement sub = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]"));
//        sub.click();

        WebElement home1 = driver.findElement(By.xpath("(//*/ol/li/span/button)[1]"));
        home1.click();
        WebElement home2 = driver.findElement(By.xpath("(//*/ol/li/span/button)[2]"));
        home2.click();
        WebElement home3 = driver.findElement(By.xpath("(//*/ol/li/span/button)[3]"));
        home3.click();
        WebElement home4 = driver.findElement(By.xpath("(//*/ol/li/span/button)[4]"));
        home4.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",home4);

        WebElement home5 = driver.findElement(By.xpath("(//*/ol/li/span/button)[5]"));
        home5.click();
        WebElement home6 = driver.findElement(By.xpath("(//*/ol/li/span/button)[6]"));
        home6.click();


        WebElement check17 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[17]"));

        check17.click();
        WebElement check16 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[16]"));
        check16.click();
        WebElement check14 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[14]"));
        check14.click();
        WebElement check13 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[13]"));
        check13.click();
        WebElement check12 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[12]"));
        check12.click();
        WebElement check11 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[11]"));
        check11.click();
        WebElement check9 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[9]"));
        check9.click();
        WebElement check8 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[8]"));
        check8.click();
        WebElement check7 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[7]"));
        check7.click();
        WebElement check4 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[4]"));
        check4.click();
        WebElement check3 = driver.findElement(By.xpath("(//div[@id='tree-node']//span[@class='rct-checkbox'])[3]"));
        check3.click();

        WebElement containsText = driver.findElement(By.id("result"));
        String text = "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        System.out.println(containsText.getText());
        Assert.assertTrue(containsText.getText().contains(text));





//        WebElement checkBlock = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
//
//
//
//
//        List<WebElement> buttons= checkBlock.findElements(By.xpath("//*/ol/li/span/button"));
//
//        for (WebElement button: buttons){
//            button.click();
//        }
        Thread.sleep(8000);

        driver.close();
        driver.quit();




    }
}

