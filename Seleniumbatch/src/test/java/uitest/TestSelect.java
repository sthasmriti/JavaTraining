package uitest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class TestSelect {

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
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS).implicitlyWait(4, TimeUnit.SECONDS);
    }


//    @Test
//    public void test_select_class2() throws InterruptedException {
//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//        Thread.sleep(1000);
//
//        String alertTest = driver.switchTo().alert().getText();
//        Assert.assertEquals("Do you confirm action?", alertTest);
//        System.out.println(alertTest);
//
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//        String var = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
//        Assert.assertEquals("You selected Ok", var);
//        System.out.println(var);
////
//    }


//    @Test
//    public void test_select_class4() {
//        driver.get("https://demoqa.com/radio-button");
//            WebElement ele = driver.findElement(By.xpath("//input[@id='yesRadio']/../preceding-sibling::div"));
//
//        System.out.println("The header text is -"+ele.getText());


//        String var = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
//
//        System.out.println(var);
//
//        if(var.contains("Cancel")){
//            Assert.assertTrue(true);
//
//        }else{
//            Assert.fail("Cancel message not present after dismissing");
//        }
//
//    @Test
//    public void hover_test() throws InterruptedException {
//        driver.get("https://www.spicejet.com/");
//        Actions actions = new Actions(driver);
//        WebElement spicejet = driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"));
//        actions.moveToElement(spicejet).build().perform();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'/home#program')]")));
//
//        WebElement homeprogram = driver.findElement(By.xpath("//a[contains(@href,'/home#program')]"));
//
//        String targetattr = homeprogram.getAttribute("target");
//
//        if (targetattr.equals("_blank")) {
//            Assert.assertTrue(true);
//        } else {
//            Assert.fail("Link Our Program has no attribute _blank");
//        }
//
//        homeprogram.click();
//
//        Thread.sleep(4000);
//
//        actions.keyDown(Keys.CONTROL).keyDown(Keys.TAB).build().perform();
//    }

    @Test
    public void test_entertext() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.getElementById('user-name').setAttribute('value','new user')");
        WebElement element = driver.findElement(By.xpath("//input[@id='user-name']"));
        js.executeScript("arguments[0].setAttribute('value','test_user_1')", element);
        Thread.sleep(5000);
    }




    @AfterTest
    public void aftertest() {
        driver.quit();
    }


}







