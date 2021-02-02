import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCodeTest {

    @BeforeClass
    public static void setUpClass(){
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void theInternetTest() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

    @Test
    public void cypressTest() throws InterruptedException{
//        WebDriver driver = new FirefoxDriver(); -- Firefox browser tests are not running for this test
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.cypress.io/");
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

    @Test
    public void shoppingCartTest() throws InterruptedException{
//        WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
