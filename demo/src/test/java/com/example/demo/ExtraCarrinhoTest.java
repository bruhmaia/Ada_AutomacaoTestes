package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCarrinhoTest {
    public void adicionarAoCarrinho(){
        WebDriver driver = new ChromeDriver();
        ExtraCarrinho carrinho = new ExtraCarrinho();
        carrinho.getButtonComprar();
        carrinho.continuarCompra();
    }


@Test
    void TesteValordoProdutoIgualAoMostrado_Celular1110IgualA1110(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    ExtraCarrinho carrinho = new ExtraCarrinho();
    adicionarAoCarrinho();
    assertTrue(carrinho.conferirPreco().equals("R$ 1.110,00"));
}
@Test
    void QuantidadeDeProdutosdoCarrinho_1ProdutoAadicionadoIgualA1(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    ExtraCarrinho carrinho = new ExtraCarrinho();
    adicionarAoCarrinho();
    assertTrue(carrinho.getQuantidadeProduto().equals("1"));
}
}