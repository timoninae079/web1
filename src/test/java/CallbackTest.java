import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class CallbackTest {
    public WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        System.setProperty("WebDriver.chrome.driver", "D:/web/driver/Chromedriver.exe");
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
    void shouldTestSomething() {
        driver.get("http://localhost:9999");
    }
}

