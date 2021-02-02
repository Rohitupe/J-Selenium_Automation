import org.junit.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Run Web Driver without specifying path */
public class HelloTest2 {

    // This method will run once before all the tests in our class
    @BeforeClass
    public static void setUpClass(){
//         capture web browser automatically
        WebDriverManager.chromedriver().setup();
    }

    // This is the test method where test cases are specified
    @Test
    public void FirstTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.close();
        driver.quit();
    }
}
