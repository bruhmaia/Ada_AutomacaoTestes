package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class ExtraPesquisaTest {
        private void pesquisarPor(final String stringPesquisa, WebDriver driver) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
            ExtraPesquisa page = new ExtraPesquisa(driver);
            assertEquals("Extra", page.getTitle());
            WebElement produtoPesquisado = page.getSearchInput();
            produtoPesquisado.clear();
            produtoPesquisado.sendKeys(stringPesquisa);
            produtoPesquisado.submit();
            assertTrue(page.getTitle().startsWith(stringPesquisa));
    }
    @Test
    public void test_pesquisarPorCelular() {
        WebDriver driver = new ChromeDriver();
        pesquisarPor("Celular", driver);
    }


}