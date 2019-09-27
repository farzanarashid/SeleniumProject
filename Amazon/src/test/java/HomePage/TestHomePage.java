package HomePage;

import common.commonApi;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends commonApi {
    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals("Facebook - Log In or Sign Up",title);
    }
    @Test

    public void test2() throws InterruptedException {

        TypeOnElements("#email","lizaliza1177@gmail.com");
        TypeOnElements("#pass","aroni156");
        ClickOnElements("#u_0_2");
        //driver.findElement(By.id("email")).sendKeys("lizaliza1177@gmail.com");
        //driver.findElement(By.id("pass")).sendKeys("aroni156");
        //driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(1000);
    }
}
