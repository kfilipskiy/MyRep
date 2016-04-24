import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SamleSeleniumTest {

    package com.google.tests;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.testng.annotations.AfterClass;
    import org.testng.annotations.BeforeClass;
    import org.testng.annotations.Test;

    public class GmailTest {

        private WebDriver driver;
        String appURL = "https://accounts.google.com/Login";

        @BeforeClass
        public void testSetUp() {
            driver = new FirefoxDriver();
        }

        @Test
        public void verifyGooglePageTittle() throws InterruptedException {
            driver.navigate().to(appURL);
            driver.findElement(By.id("Email")).sendKeys("11111@gmail.com");
            driver.findElement(By.id("next")).click();
            driver.findElement(By.id("Passwd")).sendKeys("111");
            driver.findElement(By.id("signIn")).click();
            //driver.findElement(By.id("COMPOSE")).click();
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }

    }


}
