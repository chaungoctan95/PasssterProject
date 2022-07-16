package com.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ObjectRepository {
    public String URL = "http://chaungoctan.local/";
    public String dataWrong = "1456";
    public String data = "456";
    By protectionPage = By.xpath("//a[normalize-space()='Page protection']");
    By formTitle = By.xpath("//h4[normalize-space()='Protected Area']");
    By formTxt = By.xpath("//p[contains(text(),'This content is password-protected. Please verify ')]");
    By passwordInput = By.xpath("//input[@id='passster_password']");
    By submitBtn = By.xpath("//button[normalize-space()='Submit']");
    By alarmTxt = By.xpath("//div[@class='passster-error']");
    By bodyTxt = By.xpath("//div[@class='wp-container-7 entry-content wp-block-post-content']");

    By areaProtectionPage = By.xpath("(//a[normalize-space()='Area Protection Elementor'])[1]");

}
