package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraProdutoEsgotado extends Page {
    public ExtraProdutoEsgotado() {
        super();
        driver.get("https://www.extra.com.br/smartphone-samsung-galaxy-a03-preto-64gb-4gb-ram-tela-infinita-de-6-5-camera-dupla-traseira-bateria-5000-mah-e-processador-octa-core-55041496/p/55041496");
    }

    public WebElement getButtonComprar() {
        return driver.findElement(By.id("buy-button"));
    }
    public String getMensagem() {
        return driver.findElement(By.xpath("//*[@id=\"titleAvailability\"]")).getText();
    }
}
