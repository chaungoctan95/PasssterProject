package com.base;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helpers {
    WebDriver driver;

    public Helpers(WebDriver _driver) {
        this.driver = _driver;
    }
    public  void delay(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickElement(By by) {
        //Set timeout for WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait to click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //click
        driver.findElement(by).click();

    }
    public void setText(By by, String value) {
        //Set timeout for WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait to click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //sendKeys
        driver.findElement(by).sendKeys(value);

    }



}