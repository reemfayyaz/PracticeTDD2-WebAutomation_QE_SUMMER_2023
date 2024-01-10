package com.nysoftusa.testpages;

import com.nysoftusa.Pages.BestBuyHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BestBuyHomePageWebTest extends BestBuyHomePage {
    // Test Class: where we wrote all the test cases
    // Test case means the methods which belongs to a @Test annotation
@Test
    public static void verifySearchProduct(){
        searchProduct();
    String expectedResult="\"computer\"";
    String actualResult=driver.findElement(By.xpath("//h1[text()='\"computer\"']")).getText();
    Assert.assertEquals(actualResult,expectedResult,"does not match");




    }
    @Test
    public static void verifySearchProductNegativeTest(){
        searchProduct();
        String expectedResult="\"comp uter\"";
        String actualResult=driver.findElement(By.xpath("//h1[text()='\"computer\"']")).getText();
        Assert.assertEquals(actualResult,expectedResult,"does not match");




    }

}
