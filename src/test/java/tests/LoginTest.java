package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

        @Test
        public void testValidLogin() {
            WebDriver driver = WebDriverManager.chromiumdriver().create();

            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/v1/");

            loginPage.InputUsername("standard_user");
            loginPage.InputPassword("secret_sauce");
            loginPage.ClickLoginBtn();

        }

        @Test
        public void testInvalidUsernameLogin() {
            WebDriver driver = WebDriverManager.chromiumdriver().create();
            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/v1/");

            loginPage.InputUsername("abdul");
            loginPage.InputPassword("secret_sauce");
            loginPage.ClickLoginBtn();
        }

        @Test
        public void testWrongPasswordLogin() {
            WebDriver driver = WebDriverManager.chromiumdriver().create();
            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/v1/");

            loginPage.InputUsername("standard_user");
            loginPage.InputPassword("123");
            loginPage.ClickLoginBtn();
        }

        @Test
        public void testBlankUsernameLogin() {
            WebDriver driver = WebDriverManager.chromiumdriver().create();
            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/v1/");

            loginPage.InputUsername("");
            loginPage.InputPassword("secret_sauce");
            loginPage.ClickLoginBtn();
        }

        @Test
        public void testBlankPasswordLogin() {
            WebDriver driver = WebDriverManager.chromiumdriver().create();
            LoginPage loginPage = new LoginPage(driver);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.saucedemo.com/v1/");

            loginPage.InputUsername("standard_user");
            loginPage.InputPassword("");
            loginPage.ClickLoginBtn();
        }
}
