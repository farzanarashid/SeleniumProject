package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class commonApi {
    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\farhana rashid\\IdeaProjects\\seleniumProject1\\seleniumchromedriver2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }

    //helper method
    public void ClickOnElements(String Locator) {
        try {
            driver.findElement(By.cssSelector(Locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(Locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(Locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(Locator)).click();
                }
            }
        }
    }


    public void TypeOnElements(String Locator, String Value) {
        try {
            driver.findElement(By.cssSelector(Locator)).sendKeys(Value);
        } catch (Exception ex1) {
            try {
                driver.findElement(By.id(Locator)).sendKeys(Value);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.className(Locator)).sendKeys(Value);
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(Locator)).sendKeys(Value);
                }
            }
        }
    }

}
