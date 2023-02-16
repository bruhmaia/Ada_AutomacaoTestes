package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraLogin extends Page {
    public ExtraLogin() {
        super();
        driver.get("https://carrinho.extra.com.br/Checkout?ReturnUrl=//www.extra.com.br#login");
    }

    public WebElement getCPF() {
        return driver.findElement(By.id("CpfCnpj"));
    }

    public WebElement getContinueLogin() {
        return driver.findElement(By.id("btnContinuarLogin"));
    }

    public WebElement getSenha() {
        return driver.findElement(By.id("Senha"));
    }
    public WebElement getButtonLogin() {
        return driver.findElement(By.id("btnLogin"));
    }

    public void login(String cpf, String senha) {
        getCPF().sendKeys(cpf);
        getSenha().sendKeys(senha);
        getButtonLogin().click();
    }
}
