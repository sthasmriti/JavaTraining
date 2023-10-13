package uitest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TakeScreenShot {

    WebDriver driver;
    @BeforeTest
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        ops.addArguments("--start-maximized");
        ops.addArguments("--incognito");
        ops.addArguments("--disable-geolocation");
        ops.setExperimentalOption("useAutomationExtension", false);
        ops.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(ops);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @Test
    public void TestingToTakeScreenshot() throws Exception{
        driver.get("https://www.spicejet.com/");
        this.takeSnapShot(driver, ".//screenshot/screen.png");

    }
    private void takeSnapShot(WebDriver webDriver, String filewithPath) throws Exception {
        TakesScreenshot srcShot = ((TakesScreenshot) webDriver);
        File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File (filewithPath);
        FileUtils.copyFile(SrcFile, DestFile);
   }

    private static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    @AfterTest
    public void aftertest() {

        driver.quit();
    }
}

