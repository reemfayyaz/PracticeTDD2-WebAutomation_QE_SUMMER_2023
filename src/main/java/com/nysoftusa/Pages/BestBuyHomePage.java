package com.nysoftusa.Pages;

import com.nysoftusa.configaration.WebTestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.nysoftusa.WebElement.BestBuyHomePageWebElement.searchBoxWebElement;
import static com.nysoftusa.WebElement.BestBuyHomePageWebElement.searchButtonWebElement;


public class BestBuyHomePage extends WebTestBase {


    public static void searchProduct() {
        driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]")).sendKeys("computer");
        waitFor(3);
        driver.findElement(By.xpath("//button[@class='header-search-button']")).click();

    }
}