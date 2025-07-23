package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {
    By ProductTitle = By.id("item_0_title_link");
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validateOnHomePage(){
        WebElement ProductElement = driver.findElement(ProductTitle);
        assertTrue(ProductElement.isDisplayed());
        assertEquals("Sauce Labs Bike Light", ProductElement.getText());
    }
}
