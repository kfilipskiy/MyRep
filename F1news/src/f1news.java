        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class f1news {

    private WebDriver driver;
    String appURL = "https://f1news.ru/";

    @BeforeClass
    public void testSetUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void verifyGooglePageTittle() throws InterruptedException {
        driver.navigate().to(appURL);
       // driver.findElement(By.id("Email")).sendKeys("73venskies@gmail.com");
       // driver.findElement(By.id("next")).click();
       // driver.findElement(By.id("Passwd")).sendKeys("Gm$So_n1c90g");
        //driver.findElement(By.id("signIn")).click();
       // driver.findElement(By.id("COMPOSE")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
