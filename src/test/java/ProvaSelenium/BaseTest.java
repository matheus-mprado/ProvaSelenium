package ProvaSelenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    protected static final String URL_BASE = "http://automationpractice.pl/index.php ";
    protected static final String DRIVER_PATH = "src/test/resource/chromedriver.exe";

    @BeforeClass
    public static void Iniciar() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void Encerrar() {
        driver.quit();
    }
}
