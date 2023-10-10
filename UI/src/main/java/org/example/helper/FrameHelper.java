package org.example.helper;

import org.openqa.selenium.WebDriver;

import java.awt.*;

public class FrameHelper {
WebDriver driver;

    public FrameHelper switchToFrame(String txt){
        driver.switchTo().frame(txt);
        return this;

    }

    public FrameHelper switchToParentFrame(){
        driver.switchTo().parentFrame();
        return this;
    }

    public FrameHelper defaultFrame(){      //возвращает в самый главный html
        driver.switchTo().defaultContent();
        return this;
    }

}
