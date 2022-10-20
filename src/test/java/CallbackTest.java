import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallbackTest {
    private WebDriver driver = new ChromeDriver();

    @BeforeAll
    static void setUpAll() {

        System.setProperty("WebDriver.chrome.driver", "driver/Chromedriver.exe");
    }

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
    }

    @AfterEach
    void tearsDow() {
        driver.quit();
        driver = null;
    }

    @Test
    void Test() {
        driver.get("http://lokalhost:9999");
    }
}

