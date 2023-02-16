package com.example.demo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLoginTest {
    @Test
    void testLogin_LoginInvalido() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruna\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        ExtraLogin pagelogin = new ExtraLogin();

        pagelogin.getCPF().sendKeys("00000000000");
        pagelogin.getCPF().submit();
        assertFalse(pagelogin.getContinueLogin().isEnabled());
    }
}