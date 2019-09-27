package HomePage;

import common.commonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHome extends commonApi {
   @Test
    public void test1(){

      TypeOnElements("#gh-ac","adidas");
      ClickOnElements("gh-btn");
      //driver.findElement(By.id("gh-ac")).sendKeys("adidas", Keys.ENTER);

    }
}
