package uitest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

        WebDriver driver;

        @BeforeTest
        public void beforetest() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");
            ops.addArguments("--start-maximized");
            ops.addArguments("--incognito");
            ops.setExperimentalOption("useAutomationExtension", false);
            ops.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            driver = new ChromeDriver(ops);
            //implicit wait
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        }

        @Test()
        public void firsttest() {
            driver.get("https://www.saucedemo.com/");

            String title = driver.getCurrentUrl();

            if (title.equals("https://www.saucedemo.com/")) {
                Assert.assertTrue(true);
            } else {
                Assert.fail("Title didn't match");
            }
        }

    @Test(priority = 1)
    public void positive_login_scenario() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("locked_out_user");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[id='login-button']")).click();
        //Thread.sleep(2000);
        String errortext = driver.findElement(By.xpath("//div[contains(@class,'error-message-container')]/h3[contains(text(),'Sorry, this user has been locked out.')]")).getText();
        if (errortext.contains("this user has been locked out.")){
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("Text doesn't contains locked out user");
        }
        //Thread.sleep(3000);


    }

        @AfterTest
        public void aftertest() {
            driver.quit();
        }

    }


