package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class ExtraProdutoEsgotadoTest {
    @Test
    void BotaoComprarInvalidoQuandoProdutoEsgotado() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ExtraProdutoEsgotado produtoEsgotado = new ExtraProdutoEsgotado();
        assertFalse(produtoEsgotado.getButtonComprar().isEnabled());
    }

    @Test
    void MensagemEsperadaQuandoProdutoEsgotado() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ExtraProdutoEsgotado produtoEsgotado = new ExtraProdutoEsgotado();
        String mensagemEsperada = null;
        mensagemEsperada.equalsIgnoreCase("Infelizmente não temos estoque do produto que você está procurando no momento.");
        assertEquals(produtoEsgotado.getMensagem(), mensagemEsperada);
    }
}
