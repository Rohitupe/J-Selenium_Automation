// Test should be written at the end of every class - to run test with maven

/* Here we have to specify driver manually and have to run it by specifying the path of driver */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTest {

    // writing first test
    public void firstTest(){
        //Telling the system where to find chromedriver on Windows.
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
    }
}
