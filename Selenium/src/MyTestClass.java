/**
 * Created by ed on 31.03.2016.
 */
public class MyTestClass {
    public static void main(String[] args) {


    }

    public static void testMail () {

        WebDriver driver = new FirefoxDriver();
        //WebDriver driver1 = new ChromeDriver();

        driver.get( "http://google.com");
        driver.findElement("//div");
        driver.sendKeys("fdfdf");
        driver.findElement("//");
        driver.close();
        driver.quit();

    }
}
