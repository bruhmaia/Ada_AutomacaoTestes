package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ExtraCarrinho extends Page {
    public ExtraCarrinho() {
        super();
        driver.get("https://www.extra.com.br/smartphone-samsung-galaxy-a13-preto-128gb-4gb-ram-tela-infinita-de-6-6-camera-quadrupla-traseira-bateria-de-5000-mah-e-processador-octa-core-55048198/p/55048198");
    }

    public WebElement getButtonComprar() {
        return driver.findElement(By.id("buy-button"));
    }


    public WebElement continuarCompra() {
        return driver.findElement(By.xpath("//*[@id=\"totalizer-v2-subtotal\"]/button"));
    }
    public String conferirPreco(){
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div/strong")).getText();
    }

    public WebElement getQuantidadeProduto(){
        return driver.findElement(By.xpath("//*[@id=\"55048198,15,579605997\"]"));
    }

    public WebElement continuarNovamenteCompra() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div[3]/div[2]/div/div/a"));
    }

    public WebElement escolherOutroProduto() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div[3]/div[2]/div/a"));
    }
}