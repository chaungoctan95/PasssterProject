package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.SetupBrowser;

import java.util.List;


public class ProjectTest extends SetupBrowser {

    @Test
    public void pageProtection() {

        driver.get(obj.URL);
        helpers.clickElement(obj.protectionPage);
        helpers.setText(obj.passwordInput, obj.dataWrong);
        helpers.clickElement(obj.submitBtn);
        helpers.delay(5000);

        //Check unlocked successfully through the contents inside
        //WebElement bodyContent = driver.findElement(obj.bodyTxt);
        //Assert.assertTrue(bodyContent.isDisplayed(), "Error");

        // Check unlocked successfully through the alarm text
        String alarmTxt = driver.findElement(obj.alarmTxt).getText();
        Assert.assertEquals(alarmTxt, "Invalid password.");


        helpers.setText(obj.passwordInput, obj.data);
        helpers.clickElement(obj.submitBtn);
        helpers.delay(5000);

        WebElement bodyTxt = driver.findElement(obj.bodyTxt);
        Assert.assertTrue(bodyTxt.isDisplayed());
        System.out.println("Success!");
        helpers.delay(5000);
    }

    @Test
    public void areaProtection() {
        driver.get(obj.URL);
        helpers.clickElement(obj.areaProtectionPage);
        helpers.setText(obj.passwordInput, obj.dataWrong);
        helpers.clickElement(obj.submitBtn);
        helpers.delay(5000);
        //Check unlocked successfully through the contents inside
        //WebElement bodyContent = driver.findElement(obj.bodyTxt);
        //Assert.assertTrue(bodyContent.isDisplayed(), "Error");

        // Check unlocked successfully through the alarm text
        WebElement alarmTxt = driver.findElement(obj.alarmTxt);
        Assert.assertEquals(alarmTxt.getText(), "Invalid password.");

        helpers.setText(obj.passwordInput, obj.data);
        helpers.clickElement(obj.submitBtn);
        helpers.delay(5000);

        // Check if the element is visible.
//        List<WebElement> m= driver.findElements(By.xpath("//input[@id='passster_password']"));
//        // verify size
//        if ( m.size() > 0){
//            System.out.println("Text: " + obj.passwordInput + " is present. ");
//        }
//        else{
//            System.out.println("Text: " + obj.passwordInput+" is not present. ");
//        }
        // Check if the element is visible.
        Boolean isPresent = driver.findElements(obj.passwordInput).size() > 0;
        Assert.assertFalse(isPresent, "present");
        System.out.println("not present");
        helpers.delay(5000);


        // Other


        //helpers.clickElement(obj.protectionPage);
    }

}
