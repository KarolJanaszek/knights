package knightsoforder.knights;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestCase {
    protected WebDriver webDriver;

    @BeforeClass
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @AfterTest
    public void closeChrome() {
        webDriver.close();
        webDriver.quit();
    }
}
