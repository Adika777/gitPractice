package org.example.pages;

import org.example.driver.Driver;
import org.example.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public ElementActions elementActions = new ElementActions();
}
