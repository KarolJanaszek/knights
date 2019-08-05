package knightsoforder.knights;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends TestCase {

    @Test
    public void testRegistry() {

        webDriver.navigate().to("http://localhost:5050");
        WebElement button = webDriver.findElement(By.xpath("//section[@class='s-content-reg s-content--narrow']//center//form//input"));
        button.click();

    }

}
