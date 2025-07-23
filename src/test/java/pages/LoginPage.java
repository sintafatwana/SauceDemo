package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.LoginTest;

import static org.bouncycastle.cms.RecipientId.password;

public class LoginPage {

    WebDriver driver;

    By UsernameField = By.id("user-name");
    By PasswordField = By.id("password");
    By LoginButton = By.id("login-button");
    By ErrorMessage  = By.id("error");
    By ProductTitle = By.id("item_0_title_link");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void InputUsername(String username){
        driver.findElement(UsernameField).sendKeys(username);
    }

    public void InputPassword(String password){
        driver.findElement(PasswordField).sendKeys(password);
    }

    public void ClickLoginBtn(){
        driver.findElement(LoginButton).click();
    }
}
