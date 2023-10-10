package DEMO;

import com.beust.jcommander.JCommander;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.nio.file.Watchable;
import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends BaseTest{

    @Test
    void demo1() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
        Thread.sleep(3000);
        driver.navigate().back(); //назад на прошлую страницу
        Thread.sleep(3000);
        driver.navigate().forward();// вперед на одну страницу
        Thread.sleep(3000);
        driver.navigate().refresh(); //обновление страницы
        Thread.sleep(3000);

    }
    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));

//        Select select = new Select(selectColor);
//        select.selectByVisibleText("Green"); //выбираем по имени значения по тексту
//        Thread.sleep(3000);
//
//        select.selectByValue("4");
//        Thread.sleep(3000);
//
//        select.selectByIndex(7); //violet
//        Thread.sleep(3000);
//
//        WebElement selectReact = driver.findElement(By.id("withOptGroup"));
//        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
//        inputClick.click();
//        List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]"));
//        WebElement selectReactInput = driver.findElement(By.id("react-select-2-input"));
//        String[] itemsValue = new String[6];
//        for (int i = 0; i < menuItem.size(); i++) {
//            itemsValue[i] = String.valueOf(menuItem.get(i).getText());
//        }
//        System.out.println(itemsValue.length);
//        Random random = new Random();
//        int numberOfItemsToSelect = random.nextInt(itemsValue.length);
//        System.out.println(numberOfItemsToSelect);
//        System.out.println(itemsValue[5]);
//        selectReactInput.sendKeys(itemsValue[numberOfItemsToSelect]);
//        selectReactInput.sendKeys(Keys.ENTER);
//    }

//
//        List<WebElement> selectedOptions = select.getOptions();
////        for (WebElement options : selectedOptions){
////            System.out.println(options.getText());
////        }
//        selectRandomColor(select,selectedOptions);
//
//    }
//
//    public  void selectRandomColor(Select select,List<WebElement> selectedOption) throws InterruptedException {
//
//        List<WebElement> selectedOptions = select.getOptions();
//
//        Random randomColor = new Random();
//        int indexColor = randomColor.nextInt(selectedOptions.size());
//        select.selectByIndex(indexColor);
//        Thread.sleep(3000);
//
//
//
    }}

