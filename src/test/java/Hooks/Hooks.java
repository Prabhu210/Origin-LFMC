package Hooks;

import org.helper.Baseclass;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {

    private static boolean loggedIn = false;

    @Before
    public void setUp() throws InterruptedException {
        if (!loggedIn) {
            browserconfig();
            launchbrowser("https://origin-factory-serialisation-react-qa12.vercel.app/login");
            maxiwindow();
            driver.findElement(By.id("mobile")).sendKeys("9884893210");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
            driver.findElement(By.xpath("//button[text()='Submit']")).click();
            loggedIn = true;
            Thread.sleep(2000);
            String title2 = driver.getTitle();
            System.out.println(title2);
            Assert.assertEquals(title2,"LFMC-ORIGIN");
        }
    }

    @After
    public void tearDown() {
        
    }
}

