package org.example.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.staticfields.StaticInstances;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class HomePageDefination {
    @When("User clicks add to cart for {string}")
    public void user_clicks_add_to_cart(String product) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(StaticInstances.sbc.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")));
        StaticInstances.sbc.getDriver().findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
    }

    @Then("{string} should be added to cart")
    public void added_to_cart(String product) throws InterruptedException {
        StaticInstances.sbc.getDriver().findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        WebDriverWait wait = new WebDriverWait(StaticInstances.sbc.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']")));
        String text = StaticInstances.sbc.getDriver().findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']")).getText();;
        Assert.assertEquals("Sauce Labs Bolt T-Shirt", text);

    }


}
