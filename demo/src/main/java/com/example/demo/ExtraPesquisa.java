package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraPesquisa extends Page {
    public ExtraPesquisa(WebDriver driver) {
        super();
        driver.get("https://www.extra.com.br/");
    }
    public WebElement getSearchInput(){
        return driver.findElement(By.id("strBusca"));
    }

    @Override
    public String getTitle(){
        return driver.getTitle();
    }
}
