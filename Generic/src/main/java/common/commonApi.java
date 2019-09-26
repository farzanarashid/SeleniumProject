package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class commonApi {
  public  WebDriver driver = null;
  @Parameters({"url"})
    @BeforeMethod
    public void setup(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\farhana rashid\\IdeaProjects\\seleniumProject1\\seleniumchromedriver2\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanup(){
        driver.quit();
    }
}
