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

        TypeOnElements("#email","ab7@gmail.com");
        TypeOnElements("#pass","123456");
       // ClickOnElements("#u_0_2");

        //Thread.sleep(1000);
    }
}
