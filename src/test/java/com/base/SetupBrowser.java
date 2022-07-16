package com.base;

import com.testcase.ObjectRepository;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class SetupBrowser {
    public WebDriver driver;
    public WebElement element;

    public ObjectRepository obj;
    public Helpers helpers;
    public Select select;


    @BeforeClass
    public void createDriver()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        System.out.println("Started Driver");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        obj = new ObjectRepository();
        helpers = new Helpers(driver);


    }

    @AfterClass
    public void closeDriver(){
        driver.quit();
        System.out.println("Closed Driver");
    }
}