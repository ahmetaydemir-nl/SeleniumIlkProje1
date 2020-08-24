package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class youtubeMuzikAcma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/ahmetaydemir/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("classic music");
        driver.findElement(By.id("search-icon-legacy")).submit();
        driver.findElement(By.id("search-icon-legacy")).submit();
        driver.findElement(By.id("img")).click();

    }
}
